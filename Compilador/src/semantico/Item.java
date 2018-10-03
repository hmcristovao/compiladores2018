package semantico;

public class Item {
	   private Tipo _tipo;
	   private String _valor; 
	   
	   public Item(Tipo _tipo, String _valor) {
	      this.set_tipo(_tipo);
	      this.set_valor(_valor);
	   }
	   
	   public Tipo getTipo() {
	      return this.get_tipo();
	   }
	   public String get_valor() {
	      return this.get_valor();
	   }
	   private Tipo get_tipo() {
		return _tipo;
	}

	private void set_tipo(Tipo _tipo) {
		this._tipo = _tipo;
	}

	private void set_valor(String _valor) {
		this._valor = _valor;
	}

	public String toString() {
	      return this.get_tipo() + "-" + this.get_valor();
	   }
	}