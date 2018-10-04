package semantico;

public class Item {
	
	private Enum<?> tipo;
	private String valor;
	
	public Item(Enum<?> tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
		
	}
		
	public Enum<?> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<?> tipo) {
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
