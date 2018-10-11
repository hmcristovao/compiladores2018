package semantico;

import parser.Token;

public class Simbolo {
	private Token token;
    private String nome; 
    private TipoDado tipo;
    private int referencia; 
    private static int marcador = 1;

    public Simbolo(Token _token, TipoDado _tipo, int _referencia) {
          this.token = _token;
    	  this.nome = _token.image;
          this.tipo = _tipo;
          this.referencia = _referencia;
          if(_tipo == TipoDado.NUM) {
        	  Simbolo.set_marcador(Simbolo.get_marcador() + 2);
          }
          else {
        	  Simbolo.set_marcador(Simbolo.get_marcador() + 1);
          }    
    }
    
    public Simbolo(String _nome, TipoDado _tipo) {
        this.nome = _nome;
        this.tipo = _tipo;
        if(_tipo == TipoDado.NUM) {
      	  Simbolo.set_marcador(Simbolo.get_marcador() + 2);
        }
        else {
      	  Simbolo.set_marcador(Simbolo.get_marcador() + 1);
        }    
    }
  
    public String getLexema() {
        return this.nome;
    }
    
    public int getReferencia() {
          return this.referencia;
    }

	public TipoDado getTipo() {
		return tipo;
	}
	
	public static int get_marcador() {
		return marcador;
	}

	public static void set_marcador(int _marcador) {
		Simbolo.marcador = _marcador;
	}
	
    public String toString() {
        return  " Tipo:" + this.getTipo() + " / " +  "Referencia:"+this.getReferencia() ;
  }

}