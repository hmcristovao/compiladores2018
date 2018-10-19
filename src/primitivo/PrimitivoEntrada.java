package primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo {

    private int referencia;
    private TipoDado tipo;

    public PrimitivoEntrada(int referencia, TipoDado tipo) {
        this.referencia = referencia;
        this.tipo = tipo;
    }
    
    @Override
    public String geraCodigoDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
    	return "\n\nPrimitiva Entrada:\n" + "Referência: " + this.referencia + " / " + "Tipo de dado: " + this.tipo;
    }

}
