package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoEntrada;
import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {
	
	private Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo, Token token) {
		this.simbolo = simbolo;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoEntrada comando = new PrimitivoEntrada(this.simbolo.getReferencia(), this.simbolo.getTipo());
		lista.addComando(comando);
		return lista;
	}
	
	@Override
	public String toString() {
		return "\nComando Leitura - lexema: \""+this.getLexema() 
		     + "\" - simbolo: " + this.simbolo.getNome();
	}
}
