package primitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

    private int referencia;
    private TipoDado tipo;
    private String expDestinoAssembler;

    public PrimitivoAtribuicao(int referencia, TipoDado tipo, String expDestinoAssembler) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.expDestinoAssembler = expDestinoAssembler;
    }

    @Override
    public String geraCodigoDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getReferencia() {
        return referencia;
    }

    public TipoDado getTipo() {
        return tipo;
    }

    public String getExpDestinoAssembler() {
        return expDestinoAssembler;
    }

}
