package semantico;

public class Item {
	   private char tipo; // pode ser 'n' (numero), 'v' (variavel) ou 'o' (operador).
	   private String valor; // contem o valor do item
	   
	   public Item(char _tipo, String _valor) {
	      this.tipo = _tipo;
	      this.valor = _valor;
	   }
	   
	   public char getTipo() {
	      return this.tipo;
	   }
	   
	   public String getvalor() {
	      return this.valor;
	   }
	   
	   public String toString() {
	      return this.tipo + "-" + this.valor;
	   }
	}