package comandoAltoNivel;

import java.util.LinkedList;
import comandoPrimitivo.*;
import parser.*;

public class ComandoMatrix3D extends ComandoAltoNivel 
{
	private LinkedList<Token> variaveisControle;
	private Token cteInicializacao;
	private Token cteLimiteSuperior;
	private ListaComandosAltoNivel listaComandosAltoNivelMatrix;
	
	public ComandoMatrix3D( Token matrix3D, Token varCtrlA, Token varCtrlB, Token varCtrlC,
			Token cteInicializacao, Token cteLimiteSuperior, ListaComandosAltoNivel lstCmdAltoNivelMatrix ) 
	{
		this.token = matrix3D;
		this.variaveisControle = new LinkedList<Token>();
		this.variaveisControle.add( varCtrlA );
		this.variaveisControle.add( varCtrlB );
		this.variaveisControle.add( varCtrlC );
		this.cteInicializacao = cteInicializacao;
		this.cteLimiteSuperior = cteLimiteSuperior;
		this.listaComandosAltoNivelMatrix = lstCmdAltoNivelMatrix;
	}
	
	public String toString()
	{
		return "\nComando Matrix3D - lexema: \"" + this.getLexema() 
	     + "\" - variaveis de controle: " + this.variaveisControle 
	     + "- limites " + this.getCteInicializacao() + " to " 
	     + this.getCteLimiteSuperior() + " - lista comandos : " 
	     + this.getListaComandosAltoNivelMatrix();
		
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() 
	{
		ListaComandosPrimitivos lstComandosPrimitivosMatrix = new ListaComandosPrimitivos();
		// TODO Auto-generated method stub
		return lstComandosPrimitivosMatrix;
	}

	public LinkedList<Token> getVariaveisControle() 
	{
		return this.variaveisControle;
	}

	public Token getCteInicializacao() 
	{
		return this.cteInicializacao;
	}

	public Token getCteLimiteSuperior() 
	{
		return this.cteLimiteSuperior;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelMatrix() 
	{
		return this.listaComandosAltoNivelMatrix;
	}
	
	
}
