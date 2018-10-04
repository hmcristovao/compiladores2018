package geradorCodigo;

import semantico.Tipo;

public class Item {
	
	private Tipo tipo;
	private String valor;
	
	
	public Item() {

	}

	public String getValor() {
		return this.valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}

	
	public String toString() {
	      return this.getValor() + "(" + this.getTipo() +")";

}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}