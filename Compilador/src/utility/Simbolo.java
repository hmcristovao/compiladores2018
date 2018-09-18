package utility;

public class Simbolo {
    private String name, type;
    private int ref;
	private static int index = 0;

    public Simbolo(String nome, int inc) {
          this.name = nome;
          if(inc==1) this.type="P";
          else this.type="N";
          this.ref = Simbolo.index;
          Simbolo.index += inc;
    }
    public String getName() {
          return this.name;
    }
    public int getRef() {
          return this.ref;
    }
    public String getType() {
        return this.type;
    }
    public String toString() {
          return "Nome: "+this.getName() + " | " + "Índice: "+this.getRef() + " | Tipo: "+this.type+ "\n";
    }
}