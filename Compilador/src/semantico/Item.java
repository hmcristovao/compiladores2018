package semantico;
public class Item {
	
   private Tipo tipo; 
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
      return this.tipo + "-" + this.valor;
   }
}