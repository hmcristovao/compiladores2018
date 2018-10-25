package comando.primitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{

	String expDestinoAssembler;
	PrimitivoLabel labelFalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String _expDestinoAssembler, PrimitivoLabel _label, ListaComandosPrimitivos _lista) {
		// TODO Auto-generated constructor stub
		this.expDestinoAssembler = _expDestinoAssembler;
		this.labelFalse = _label;
		this.listaComandosPrimitivosTrue = _lista;
		
	}
	
	@Override
	String geraCodigoDestino() {
		String codigoDestino = this.expDestinoAssembler
									+ "dconst_0\n"
									+ "dcmpg\n"
									+ "ifeq "+this.labelFalse.getLabel() + "\n"
									+ this.listaComandosPrimitivosTrue.geraCodigoDestinoCompleto();
		
		return codigoDestino;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Expressao " + this.expDestinoAssembler + " / " + "LabelFalse: " + this.labelFalse + " / " + "Lista Comandos Primitivos True:" + this.listaComandosPrimitivosTrue; 
	}
}
