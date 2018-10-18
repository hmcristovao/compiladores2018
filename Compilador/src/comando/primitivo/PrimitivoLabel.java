package comando.primitivo;

public class PrimitivoLabel extends ComandoPrimitivo{

	String label;
	static int contador = 1;
	
	public PrimitivoLabel(String _label) {
		this.label = _label+PrimitivoLabel.contador;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.label; //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}
}
