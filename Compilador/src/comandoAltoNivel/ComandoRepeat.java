package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Compilador;
import parser.Token;
import semantico.Expressao;
import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.Sinal;
import semantico.TipoDado;
import semantico.TipoElemento;
import semantico.TipoOperador;

public class ComandoRepeat extends ComandoAltoNivel{
		private ListaComandosAltoNivel listaComandosAltoNivel;
		private Item numero;
	
	public ComandoRepeat (ListaComandosAltoNivel listaProgramaRepeat, Token tokenRepeat, Item numero) {		
		this.listaComandosAltoNivel = listaProgramaRepeat;
		this.token = tokenRepeat;
		this.numero = numero;
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		//____________usamos o comando for para implementar o repeat_______________//
		
		Token variavel = new Token(0,"repeat"); //cria um token para armazenar o nome da variavel repeat que sera usada para o comando PARA
		//a nome da variavel tira a possibilidade do usuario declarar duas variaveis com o mesmo nome
		//como o repeat eh uma funcao,nao eh possivel o usuario declarar com mesmo nome
		
		Compilador.tabela.insereNaTabela(variavel,TipoDado.NUMERO); //insere na tabela a variavel
		Expressao exp = new Expressao(); 
		Token zero = new Token(0,"0.0"); //cria um token para armazenar o numero que ira comecar a variavel
		Item item = new Operando(TipoDado.NUMERO,TipoElemento.CTE, zero, Sinal.POS); 
		exp.addListaExpPosFixa(item); //add lista posfixa
		//cria o primeiro atributo para o for
		ComandoAtribuicao inicializacao = new ComandoAtribuicao(Compilador.tabela.pesquisaTabela(variavel.image),exp,this.token);
		
		Operando op_var = new Operando(TipoDado.NUMERO, TipoElemento.VAR, variavel, Sinal.POS);
		
		Expressao exp1 = new Expressao();
		exp1.addListaExpPosFixa(op_var);
		exp1.addListaExpPosFixa(this.numero); //add na lista o numero de repeticoes n
		exp1.addListaExpPosFixa(new Operador(TipoOperador.MENOR, new Token(0,"<")));
		
		Expressao exp2 = new Expressao();
		Token um = new Token(0,"1.0"); //cria um token para armazenar o inicio da contagem
		Item item2 = new Operando(TipoDado.NUMERO,TipoElemento.CTE, um, Sinal.POS);
		exp2.addListaExpPosFixa(op_var);
		exp2.addListaExpPosFixa(item2);
		exp2.addListaExpPosFixa(new Operador(TipoOperador.SOMA, new Token(0,"+")));
		
		ComandoAtribuicao incremento = new ComandoAtribuicao(Compilador.tabela.pesquisaTabela(variavel.image),exp2,this.token);
		
		//lista comandos alto nivel para a inicializacao
		ListaComandosAltoNivel inicial = new ListaComandosAltoNivel();
		inicial.addComando(inicializacao);
		//lista comandos alto nivel para o incremento
		ListaComandosAltoNivel passo = new ListaComandosAltoNivel();
		passo.addComando(incremento);
		
		//passa para o ComandoPara os parametros
		ComandoPara repeat = new ComandoPara(inicial, exp1, passo, listaComandosAltoNivel, this.token);
	
		return repeat.geraListaComandosPrimitivos();
		
	}
	
	public String toString() {
		return "\nComando Repeat - lexema: \"" + this.getLexema() 
		     +  " - lista comandos: " 
			 + this.listaComandosAltoNivel;
	}

}
