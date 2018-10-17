package comandoPrimitivo;
import parser.*;
import semantico.*;

public class PrimitivoSeExpFalsoGoto extends PrimitivoLabel {
	String expDestinoAssembler;
	PrimitivoLabel labelFalse; 
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel label, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
		super(label);
		// TODO Auto-generated constructor stub
	}
	
	public String geraCoigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
