package semantico;

public class Simbolo {
    private String _nome;      // nome da variável
    private Tipo _tipo;
    private int _referencia;   // referência usada na geração do código destino
    private static int _marcador = 1; // armazena a última referência incluída na tabela

    public Simbolo(String _nome, Tipo _tipo, int _referencia) {
          this._nome = _nome;
          this._tipo = _tipo;
          this._referencia = _referencia;
          if(_tipo == Tipo.numero) {
        	  Simbolo.set_marcador(Simbolo.get_marcador() + 2);
          }
          else {
        	  Simbolo.set_marcador(Simbolo.get_marcador() + 1);
          }    
    }
  
    public String getNome() {
          return this._nome;
    }
    public int getReferencia() {
          return this._referencia;
    }

	public Tipo getTipo() {
		return _tipo;
	}
	
	public static int get_marcador() {
		return _marcador;
	}

	public static void set_marcador(int _marcador) {
		Simbolo._marcador = _marcador;
	}
    public String toString() {
        return  " Tipo:" + this.getTipo() + " / " +  "Referencia:"+this.getReferencia() ;
  }

}