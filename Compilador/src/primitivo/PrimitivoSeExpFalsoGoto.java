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
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
