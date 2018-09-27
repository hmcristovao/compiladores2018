

public class Item {
	
	private Tipo tipo;
	private String valor;
	
	
	public Item() {

	}

	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}



	
	public String toString() {
	      return this.getValor() + "(" + this.getTipo() +")";

}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
