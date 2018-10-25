package comandoPrimitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo {

    private String expDestinoAssembler;
    private PrimitivoLabel labelFalse;
    private ListaComandosPrimitivos listaComandosPrimitivosTrue;

    public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
        this.expDestinoAssembler = expDestinoAssembler;
        this.labelFalse = labelFalse;
        this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
    }

    public String geraCodigoDestino() {
    	String codigoDestinoSeExpFalsoGoto = "";
    	codigoDestinoSeExpFalsoGoto += this.expDestinoAssembler;
    	codigoDestinoSeExpFalsoGoto += "dconst_0\n";
    	codigoDestinoSeExpFalsoGoto += "dcmpg\n";
    	codigoDestinoSeExpFalsoGoto += "ifeq " + this.labelFalse.getLabel() + "\n";
    	codigoDestinoSeExpFalsoGoto += this.listaComandosPrimitivosTrue.geraCodigoDestinoTotal();
    	
        return codigoDestinoSeExpFalsoGoto;
    }

    public String toString() {
    	return "\n\nPrimitiva SeExpGoTo: \nexpDestinoAssembler: " +this.expDestinoAssembler+ "\nLabelFalse: "+this.labelFalse+"\nlistaComandosPrimitivosTrue: "+this.listaComandosPrimitivosTrue ;
    }

}