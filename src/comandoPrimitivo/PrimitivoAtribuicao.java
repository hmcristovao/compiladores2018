package comandoPrimitivo;

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

    public String geraCodigoDestino() {
    	String codigoDestinoAtribuicao = "";
    	
    	codigoDestinoAtribuicao += expDestinoAssembler;
    	
    	if (tipo == TipoDado.NUM) {
    		codigoDestinoAtribuicao += "dstore ";
    	}
    	else {
    		codigoDestinoAtribuicao+= "astore ";
    	}
    	
    	codigoDestinoAtribuicao+= this.referencia + " \r\n";
    	
        return codigoDestinoAtribuicao;
    }

    public String toString() {
         	return "\n\nPrimitiva Atribuicao:\nReferencia: "+this.referencia+"\nTipo: "+this.tipo+" \nExpDestinoAssembler: "+this.expDestinoAssembler+"\n\n";
    }

}
