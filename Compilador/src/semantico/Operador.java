package semantico;


public class Operador extends Item {

	public TipoOperador tipoOperador;
	
	public TipoOperador getTipoOperador() {
		return this.tipoOperador;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tipoOperador.toString();
	}

}
