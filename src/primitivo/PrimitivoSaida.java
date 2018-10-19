package primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo {

    private TipoDado tipo;
    private String expDestinoAssembler;

    public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler) {
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
    	return "\n\nPrimitiva Saida: tipo "+this.tipo+" expDestinoAssembler "+this.expDestinoAssembler+"\n";
    }

}
