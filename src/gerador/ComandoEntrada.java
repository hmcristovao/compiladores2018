package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoEntrada;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoEntrada extends ComandoAltoNivel {

    private Simbolo variavel;
    
    public ComandoEntrada(Simbolo variavel) {
		this.variavel = variavel;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos entrada = new ListaComandosPrimitivos();
		
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipo();
		
		PrimitivoEntrada primitivoentrada = new PrimitivoEntrada(referencia, tipo);
		entrada.addComando(primitivoentrada);
		
		
		return entrada;
	}

    @Override
    public String toString() {
        return "\n\nComando Le:" + this.variavel.toString();
    }

    public Simbolo getVariavel() {
        return variavel;
    }

}
