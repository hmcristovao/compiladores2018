package comandoAltoNivel;

import java.util.LinkedList;
import comandoPrimitivo.*;
import parser.*;
import semantico.Expressao;
import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.Sinal;
import semantico.TipoDado;
import semantico.TipoElemento;
import semantico.TipoOperador;

public class ComandoMatrix3D extends ComandoAltoNivel 
{
	private Token varDimensaoX;
	private Token varDimensaoY;
	private Token varDimensaoZ;
	private Expressao expInicializacao;
	private Expressao expCondicaoParada;
	private ListaComandosAltoNivel listaComandosAltoNivelMatrix;
	
	public ComandoMatrix3D( Token matrix3D, Token varCtrlA, Token varCtrlB, Token varCtrlC,
			Expressao expInicializacao, Expressao expCondicaoParada, ListaComandosAltoNivel lstCmdAltoNivelMatrix ) 
	{
		this.token = matrix3D;
		this.varDimensaoX = varCtrlA;
		this.varDimensaoY = varCtrlB;
		this.varDimensaoZ = varCtrlC;
		this.expInicializacao = expInicializacao;
		this.expCondicaoParada = expCondicaoParada;
		this.listaComandosAltoNivelMatrix = lstCmdAltoNivelMatrix;
	}
	
	public String toString()
	{
		return "\nComando Matrix3D - lexema: \"" + this.getLexema() 
	     + "\" - variaveis de controle: " + this.getVarDimensaoX() 
	     + "-" + this.getVarDimensaoY() 
	     + "-" + this.getVarDimensaoZ()  
	     + "- limites " + this.getExpInicializacao() + " to " 
	     + this.getExpCondicaoParada() + " - lista comandos : " 
	     + this.getListaComandosAltoNivelMatrix();
		
	}

	private Expressao gerarExpressaoIncremento( Token var )
	{
		Expressao expIncrementa = new Expressao();
		expIncrementa.addListaExpPosFixa( new Operando( TipoDado.NUMERO, TipoElemento.VAR, var, Sinal.POS) );
		expIncrementa.addListaExpPosFixa( new Operando( TipoDado.NUMERO, TipoElemento.CTE, new Token(0, "1.0"), Sinal.POS) );
		expIncrementa.addListaExpPosFixa( new Operador(TipoOperador.SOMA, new Token(0, "+")));
		
		return expIncrementa;
	}
	
	private Expressao gerarExpressaoParada( Token var )
	{
		Expressao expCondicaoParada = new Expressao();
		expCondicaoParada.addListaExpPosFixa( new Operando( TipoDado.NUMERO, TipoElemento.VAR, var, Sinal.POS) );
		expCondicaoParada.addListaExpPosFixa( this.getExpCondicaoParada().getListaExpPosFixa().getFirst() );
		expCondicaoParada.addListaExpPosFixa( new Operador( TipoOperador.MENOR, new Token(0, "<" ) ) );
		
		return expCondicaoParada;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() 
	{
		// Lista de comando temporaria 
		ListaComandosAltoNivel listaComandosMatrix = new ListaComandosAltoNivel();
		ListaComandosAltoNivel lstComando1D, lstComando2D, lstComando3D;
		
		
		// Laço  mais interno : Composto pelo bloco de instruções + incremento da variavel de controle mais interna Z
		Token varDimZ =  this.getVarDimensaoZ();
		lstComando1D = this.getListaComandosAltoNivelMatrix();
		lstComando1D.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela(varDimZ.image) , this.gerarExpressaoIncremento(varDimZ), this.token ) );
		ComandoAltoNivel comandoEnquanto1D = new ComandoEnquanto( this.gerarExpressaoParada(this.getVarDimensaoZ()), lstComando1D, this.token );
		
		// Laço intermediário : Composto pelo laço mais interno + incremento da variavel de controle Y
		Token varDimY =  this.getVarDimensaoY();
		lstComando2D = new ListaComandosAltoNivel();
		lstComando2D.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela(varDimZ.image) , this.getExpInicializacao(), this.token ));
		lstComando2D.addComando( comandoEnquanto1D );
		lstComando2D.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela(varDimY.image) , this.gerarExpressaoIncremento(varDimY), this.token ) ); 
		ComandoAltoNivel comandoEnquanto2D = new ComandoEnquanto( this.gerarExpressaoParada(varDimY), lstComando2D, this.token );
		
		// Laço mais externo : Composto pelos outros 2 laços + incremento da variável de controle Z
		Token varDimX =  this.getVarDimensaoX();
		lstComando3D = new ListaComandosAltoNivel();
		lstComando3D.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela(varDimY.image) , this.getExpInicializacao(), this.token )); 
		lstComando3D.addComando( comandoEnquanto2D );
		lstComando3D.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela(varDimX.image) , this.gerarExpressaoIncremento(varDimX), this.token ) );
		ComandoAltoNivel comandoEnquanto3D = new ComandoEnquanto( this.gerarExpressaoParada(varDimX), lstComando3D, this.token );
		
		// Inicializa a primeira variavel 
		listaComandosMatrix.addComando( new ComandoAtribuicao( Compilador.tabela.pesquisaTabela( varDimX.image ), this.getExpInicializacao(), this.token ));
		listaComandosMatrix.addComando( comandoEnquanto3D );
		ListaComandosPrimitivos lstComandosPrimitivosMatrix = listaComandosMatrix.geraListaComandoPrimitivosCompleta();
		
		return lstComandosPrimitivosMatrix;
	}

	public Expressao getExpInicializacao() 
	{
		return this.expInicializacao;
	}

	public Expressao getExpCondicaoParada() 
	{
		return this.expCondicaoParada;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelMatrix() 
	{
		return this.listaComandosAltoNivelMatrix;
	}

	public Token getVarDimensaoX() 
	{
		return varDimensaoX;
	}

	public void setVarDimensaoX(Token varDimensaoX) 
	{
		this.varDimensaoX = varDimensaoX;
	}

	public Token getVarDimensaoY() 
	{
		return varDimensaoY;
	}

	public void setVarDimensaoY(Token varDimensaoY) 
	{
		this.varDimensaoY = varDimensaoY;
	}

	public Token getVarDimensaoZ() 
	{
		return varDimensaoZ;
	}

	public void setVarDimensaoZ(Token varDimensaoZ) 
	{
		this.varDimensaoZ = varDimensaoZ;
	}

	public void setExpInicializacao(Expressao expInicializacao) 
	{
		this.expInicializacao = expInicializacao;
	}

	public void setExpCondicaoParada(Expressao expCondicaoParada) 
	{
		this.expCondicaoParada = expCondicaoParada;
	}

	public void setListaComandosAltoNivelMatrix(ListaComandosAltoNivel listaComandosAltoNivelMatrix) 
	{
		this.listaComandosAltoNivelMatrix = listaComandosAltoNivelMatrix;
	}
	
	
}
