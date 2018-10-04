package semantico;

public class Simbolo {
    private String name, type;
    private int ref;

    public Simbolo(String nome, int ref) {
          this.name = nome;
          if(ref==1) this.type="P";
          else this.type="N";
          this.ref = ref;
    }
    public String getName() {
          return this.name;
    }
    public int getRef() {
          return this.ref;
    }
    public void setRef(int ref) {
        this.ref=ref;
    }
    public String getType() {
        return this.type;
    }
    public String toString() {
          return "Nome: "+this.getName() + " | " + "Índice: "+this.getRef() + " | Tipo: "+this.type+ "\n";
    }
    
}