package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{

	String expDestinoAssembler;
	TipoDado tipo;
	
	public PrimitivoSaida(String _expressao, TipoDado _tipo) {	
		this.expDestinoAssembler = _expressao;
		this.tipo = _tipo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		String codigoDestino = "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ this.expDestinoAssembler
				+ "invokevirtual java/io/PrintStream/println(D)V\n";
		
		return codigoDestino;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tipo de dado: " + tipo.name(); //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}

	

}
