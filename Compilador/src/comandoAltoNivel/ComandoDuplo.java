package comandoAltoNivel;
import comandoPrimitivo.*;
import parser.Token;

public class ComandoDuplo extends ComandoAltoNivel {
	private ListaComandosAltoNivel listaComandosAltoNivel;
	
	public ComandoDuplo(ListaComandosAltoNivel listaComandosAltoNivel, Token token)  {
		this.listaComandosAltoNivel = listaComandosAltoNivel;
		this.token = token;
	}

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaPrimeiraLoop = this.listaComandosAltoNivel.geraListaComandoPrimitivosCompleta();
		ListaComandosPrimitivos listaSegundoLoop = this.listaComandosAltoNivel.geraListaComandoPrimitivosCompleta();
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		for (ComandoPrimitivo comando : listaPrimeiraLoop.getListaComandosPrimitivos())
			lista.addComando(comando);
		
		for (ComandoPrimitivo comando : listaSegundoLoop.getListaComandosPrimitivos())
			lista.addComando(comando);

		return lista;
	}

	public String toString() {
		return "\nLista de Comandos Duplo: " + listaComandosAltoNivel;
	}
}