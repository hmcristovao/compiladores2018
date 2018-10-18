package parser;
//----- importando outros pacotes que serao utilizados
import java.io.*;
import apoio.*;
import semantico.*;
import java.util.LinkedList;
import java.util.AbstractList.*;


public class ListaComandosAltoNivel extends ComandoAltoNivel {
	static Tabela tabela = new Tabela();
	LinkedList<ComandoAltoNivel> listaComandoAltoNivel = new LinkedList<ComandoAltoNivel>();
	//fazer funcionar
	
	public ListaComandosAltoNivel() {
		
	}
	
	public void addComando(ComandoAltoNivel comando) {
		
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
