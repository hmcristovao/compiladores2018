package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {
	
	Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo) {
		this.simbolo = simbolo;
	}
	
	public String toString() {
		return  "Le " + this.simbolo.getNome() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
