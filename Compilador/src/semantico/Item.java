package semantico;

import parser.Token;

public abstract class Item {
	/*private Tipo tipo; 
	   private String valor;
	   public Item(Tipo _tipo, String _valor) {
	      this.tipo = _tipo;
	      this.valor = _valor;
	   }
	   public Tipo getTipo() {
	      return this.tipo;
	   }
	   public String getvalor() {
	      return this.valor;
	   }
	   public String toString() {
	      return this.tipo + ": " + this.valor;
	   }*/
	private Token token;
	
	public Item(Token t){
		this.token = t;
	}
	
	public String getLexema(){
		return this.token.image;
	}
	
	public abstract String toString();
	
}
