package comando.primitivo;

public class PrimitivoLabel extends ComandoPrimitivo{

	String label;
	static int contador = 1;
	
	public PrimitivoLabel(String _label) {
		this.label = _label+ "_" +PrimitivoLabel.contador;
	}
	
	@Override
	String geraCodigoDestino() {
		String codigoDestino = this.label + ":" + "\n";
		return codigoDestino;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.label; //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}
}
