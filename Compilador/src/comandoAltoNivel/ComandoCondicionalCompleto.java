package comandoAltoNivel;

import comandoPrimitivo.ComandoPrimitivo;
import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoGoto;
import comandoPrimitivo.PrimitivoLabel;
import comandoPrimitivo.PrimitivoSeExpFalsoGoto;
import parser.Token;
import semantico.Expressao;

public class ComandoCondicionalCompleto extends ComandoCondicional {
	private ListaComandosAltoNivel listaComandosAltoNivelFalse;
	
	public ComandoCondicionalCompleto(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, ListaComandosAltoNivel listaComandosAltoNivelFalse, Token token) {
		super(expressao, listaComandosAltoNivelTrue);
		this.listaComandosAltoNivelFalse = listaComandosAltoNivelFalse;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaTrue = this.listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		ListaComandosPrimitivos listaFalse = this.listaComandosAltoNivelFalse.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LABELFALSE");
		PrimitivoLabel labelSaida = new PrimitivoLabel("LABELSAIDA");
		PrimitivoGoto gotoSaida = new PrimitivoGoto(labelSaida);
		PrimitivoSeExpFalsoGoto comandoSe = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaTrue);
		
		//A Priori foi pensado em criar dois PrimitivoSeExpFalsoGoto com cada uma das listas(a listaFalse e a listaTrue)
		//Porem a expressao vai acabar sendo valida para um PrimitivoSeExpFalsoGoto e invalida ao outro (obviamente, por ser um if-else) 
		//Portanto a segunda lista deve ser preenchinda por outro meio, neste caso utilizei um laco para capturar cada comando
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		lista.addComando(comandoSe);	//Se a expressao(if) for valida, gera comandos listaTrue e
		lista.addComando(gotoSaida);	//Sai com um goto a labelSaida 
		lista.addComando(labelFalse);	//Se nao, entra em labelFalse e o loop abaixo gera a listaFalse (caso do else) e sai
		for(ComandoPrimitivo comando: listaFalse.getListaComandosPrimitivos()){	
			lista.addComando(comando);											
		}																		
		lista.addComando(labelSaida);
		
		return lista;
	}
	
	public String getLexemaSenao() {
		return " Senao ";
	}

	@Override
	public String toString() {
		return "\nComando Condicional Completo - lexema: \"" + this.getLexema() 
		     + "\" - expressao: " + this.expressao + " - lista comandos true: "
		     + this.listaComandosAltoNivelTrue + this.getLexemaSenao() +  "- lista comandos false: " + this.listaComandosAltoNivelFalse;
	}
}