package comandoAltoNivel;

import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {
	
	Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo) {
		this.simbolo = simbolo;
	}
	
	public String toString() {
		return  "Le " + this.simbolo.getNome() + "\n";
	}
	

}
