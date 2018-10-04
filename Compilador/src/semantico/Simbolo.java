package semantico;

public class Simbolo {
	
	private String nome;      // nome da variável
    private int referencia;   // referência usada na geração do código destino
    private static int marcador = 1; // armazena a última referência incluída na tabela
    private String tipo; // tipo da variavel declarada
    
    public Simbolo(String _nome) {
          this.nome = _nome;
          this.referencia = Simbolo.marcador;
          //Simbolo.marcador += 2;
    }
    
    public Simbolo(String _nome, String tipo) {
        this.nome = _nome;
        this.referencia = Simbolo.marcador;
        this.tipo = tipo;
        
  }
  
  
    
    public String getNome() {
          return this.nome;
    }
    public int getReferencia() {
          return this.referencia;
    }
    public String toString() {
          return "Nome:"+this.getNome() + " / " + "Referência:"+this.getReferencia() + "\n";
    }
    public void setReferencia() {
    	if(this.tipo == Tipo.numero.toString())this.referencia+=Tipo.numero.getValor();
    	
    	if(this.tipo == Tipo.palavra.toString())this.referencia+=Tipo.palavra.getValor();
    }
    

}
