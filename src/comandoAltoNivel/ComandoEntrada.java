package comandoAltoNivel;
import comandoPrimitivo.*;
import semantico.*;
import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {

    private Simbolo variavel;
    
    public ComandoEntrada(Token token, Simbolo variavel) {
    	super(token);
		this.variavel = variavel;
	}

	
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaPrimitivaEntrada = new ListaComandosPrimitivos();
		
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipo();
		
		PrimitivoEntrada primitivoEntrada = new PrimitivoEntrada(referencia, tipo);
		listaPrimitivaEntrada.addComando(primitivoEntrada);
		
		return listaPrimitivaEntrada;
	}

    
    public String toString() {
        return "\n\nComando Le:" + this.variavel.toString();
    }


}
