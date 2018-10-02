package semantico;

public class Item {
	
	private String tipo;
	private String valor;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String toString() {
	      return this.getValor() + "(" + this.getTipo() +") ";

	 }

}
