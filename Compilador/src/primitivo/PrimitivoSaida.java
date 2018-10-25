package primitivo;
import parser.*;
import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	public String expDestinoAssembler;
	public TipoDado tipo;
	
	
	public PrimitivoSaida(String exp, TipoDado tipo) {
		this.expDestinoAssembler = exp;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() {
		String saida = "";
		if (this.tipo == TipoDado.NUM)
		{
			saida += "getstatic java/lang/System/out Ljava/io/PrintStream;\r\n" 
						+ this.expDestinoAssembler
						+"invokevirtual java/io/PrintStream/println(D)V\r\n";
		}
		else if(this.tipo == TipoDado.STR) {
			saida += "getstatic java/lang/System/out Ljava/io/PrintStream;\r\n" 
					+ this.expDestinoAssembler 
					+"invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\r\n";
		}
		return saida;
	}
	
	public String toString() {
		return this.expDestinoAssembler + "," + this.tipo;
	}
}
