package primitivo;

//desvia o fluxo de um label somente se o resultado da expressao for falso
//caso contrario, executa uma lista de comandos.
public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	public String expDestinoAssembler; //exp em ASSEMBLY CODE
	public PrimitivoLabel labelfalse;	//pra onde vai
	ListaComandosPrimitivos listaComandosPrimitivosTrue; //comandos caso a exp seja verdadeira
	
	public PrimitivoSeExpFalsoGoto(String exp, PrimitivoLabel label, ListaComandosPrimitivos lista) {
		this.expDestinoAssembler = exp;
		this.labelfalse = label;
		this.listaComandosPrimitivosTrue = lista;
	}
	
	String geraCodigoDestino() {
		String corpo = this.expDestinoAssembler + "dconst_0 \r\n" + "dcmpg \r\n" + "ifeq " + 
						this.labelfalse;
		
		for(int i=0; i<this.listaComandosPrimitivosTrue.listaComandosPrimitivos.size(); i++) {
			corpo += this.listaComandosPrimitivosTrue.listaComandosPrimitivos.get(i).geraCodigoDestino();
		}
		
		return corpo;
	}
	
	public String toString() {
		return "" + this.expDestinoAssembler;
	}

}
