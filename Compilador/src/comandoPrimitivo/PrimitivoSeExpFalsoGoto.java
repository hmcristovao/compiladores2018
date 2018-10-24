package comandoPrimitivo;

import java.io.IOException;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	String expDestinoAssembler;
	PrimitivoLabel labelFalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler , PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
		this.expDestinoAssembler = expDestinoAssembler;
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino(){ //terceira passagem
		String codDestinoSeExpFalso = "";
		//pega o resultado da expressão de dentro do if e compara com 0, se for 0, salta para label false, senão executa os comandos do true
		codDestinoSeExpFalso += ";begin se exp falso\n"
				+ this.expDestinoAssembler
				+ "dconst_0\n"
				+ "dcmpg\n"
				+ "ifeq "+this.labelFalse.geraCodigoDestino().substring(0, this.labelFalse.geraCodigoDestino().length()-1)+"\n"
				+ this.listaComandosPrimitivosTrue.geraCodigoDestinoTotal()
				+ ";end se exp falso\n";
		//compara se o resultado da 
		return codDestinoSeExpFalso;
	}

	
	public String toString() {
		return "SeExpFalsoGoto: expDestinoAssembler " +this.expDestinoAssembler+ " labelFalse "+this.labelFalse+" listaComandosPrimitivosTrue "+this.listaComandosPrimitivosTrue+"\n" ;
	}

}

