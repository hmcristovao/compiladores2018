package comando;

import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {

	Simbolo variavel;
	
	public ComandoEntrada(Token _token,Simbolo _simbolo) {
		super(_token);
		this.variavel = _simbolo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando leitura\n" +"Variavel " + this.variavel.getLexema()
		;
	}

}
