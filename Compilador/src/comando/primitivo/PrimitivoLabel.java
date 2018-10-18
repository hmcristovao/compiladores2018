package comando.primitivo;

public class PrimitivoLabel extends ComandoPrimitivo{

	String label;
	static int contador = 1;
	
	public PrimitivoLabel(String _label) {
		//this.referencia = _referencia;
		this.label = _label;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null; //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}

}
