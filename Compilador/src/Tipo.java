
public enum Tipo {
	operador(5),variavel(4),string(3),numero(2),palavra(1);
	
	private int valor;
	
	Tipo(int valorTipo){
		this.valor = valorTipo;
	}
	
	public int getValor() {
		return valor;
	}
}
