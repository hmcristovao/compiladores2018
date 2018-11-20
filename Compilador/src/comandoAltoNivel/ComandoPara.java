package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Compilador;
import parser.Token;
import semantico.*;

public class ComandoPara extends ComandoAltoNivel {
	
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;
	private Expressao expressao;
	private ListaComandosAltoNivel listaAtribuicaoInicio, listaAtribuicaoPasso;
	
	public ComandoPara (ListaComandosAltoNivel listaAtribuicaoInicio,Expressao expressao,ListaComandosAltoNivel listaAtribuicaoPasso, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {		
		
		this.listaAtribuicaoInicio=listaAtribuicaoInicio;
		this.expressao = expressao;
		this.listaAtribuicaoPasso =  listaAtribuicaoPasso;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
		this.token = token;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosAltoNivel listaCorpoPara = listaComandosAltoNivelTrue; // copia de listaComandosAltoNivelTrue para ser manipulada
		
		for (ComandoAltoNivel comando : this.listaAtribuicaoPasso.getListaComandosAltoNivel()) { //Colocando passo na lista de comandos copia
			listaCorpoPara.addComando(comando);
		}
		ComandoEnquanto laco = new ComandoEnquanto(expressao, listaCorpoPara, this.token); //cria enquanto com corpo e passo
		ListaComandosAltoNivel listaPara = this.listaAtribuicaoInicio; //cria lista inicio com inicializcao
		listaPara.addComando(laco); // adiciona enquanto na lista inicio
		
		return listaPara.geraListaComandoPrimitivosCompleta(); //gera lista compelta
		
	}
	
	@Override
	public String toString() {
		return "\nComando Para - lexema: \"" + this.getLexema() 
		     + "\" - expressao: " + this.expressao + " - lista comandos true: " 
			 + this.listaComandosAltoNivelTrue;
	}

}