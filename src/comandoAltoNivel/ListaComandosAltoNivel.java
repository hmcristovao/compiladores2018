package comandoAltoNivel;
//----- importando outros pacotes que serao utilizados
import java.io.*;
import apoio.*;
import comandoPrimitivo.ListaComandosPrimitivos;
import semantico.*;
import java.util.LinkedList;
import java.util.AbstractList.*;


public class ListaComandosAltoNivel  {
	static Tabela tabela = new Tabela();
	LinkedList<ComandoAltoNivel> listaComandoAltoNivel ;
	//fazer funcionar
	
	public ListaComandosAltoNivel() {
		this.listaComandoAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	
	public void addComando(ComandoAltoNivel comando) {
		this.listaComandoAltoNivel.add(comando);
	}


	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		for(ComandoAltoNivel comando :this.listaComandoAltoNivel)
		{
			System.out.println(comando);
		}
		return "";
	}
	

}
