package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoEntrada;
import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {
	
	Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo, Token token) {
		this.simbolo = simbolo;
		this.token = token;
	}
	
	public String toString() {
		return  this.getLexama() + " " + this.simbolo.getNome() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		PrimitivoEntrada comando = new PrimitivoEntrada(this.simbolo.getReferencia(), this.simbolo.getTipo());
		
		lista.addComando(comando);
				
		return lista;
	}
	

}
