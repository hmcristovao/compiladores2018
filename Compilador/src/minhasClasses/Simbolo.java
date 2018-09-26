package minhasClasses;

public class Simbolo {
    private String nome;      // nome da variável
    private Tipo tipo;
    private int referencia;   // referência usada na geração do código destino
    public static int marcador = 1; // armazena a última referência incluída na tabela

    public Simbolo(String nome, Tipo tipo, int valor) {
          this.nome = nome;
          this.tipo = tipo;
          this.referencia = valor;
          Simbolo.marcador += 2;
    }
    public Simbolo(Tipo tipo, String nome, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.referencia = valor;
        Simbolo.marcador += 1;
  }
  
    public String getNome() {
          return this.nome;
    }
    public int getReferencia() {
          return this.referencia;
    }

	public Tipo getTipo() {
		return tipo;
	}

    public String toString() {
          return  " Tipo:" + this.getTipo() + " / " +  "Referencia:"+this.getReferencia() ;
    }
}