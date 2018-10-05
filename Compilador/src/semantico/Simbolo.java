package semantico;

import parser.Token;

public class Simbolo {
    private String nome;
    private int ref;
    Token token;
    TipoDado tipo;

    public Simbolo(Token t, TipoDado tipo, int ref) {
          this.token=t;
          this.tipo=tipo;
          this.ref = ref;
          this.nome=t.image;
    }
    
    public String getLexema() {
          return nome;
    }
    
    public int getReferencia() {
          return this.ref;
    }
    
    public TipoDado getTipo() {
        return this.tipo;
    }
    
    public String toString() {
          return "Nome: "+this.getLexema() + " | " + "Índice: "+this.getReferencia() + " | Tipo: "+this.tipo+ "\n";
    }
    
}