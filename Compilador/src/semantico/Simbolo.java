package semantico;

import parser.Token;

public class Simbolo {
	
	private String nome;
	private Token token;
	private TipoDado tipo;
	private int referencia;
	
	
	public int getReferencia() {
		return this.referencia;
	}
	
	public Simbolo(Token token, TipoDado tipo){
		//System.out.println("chegou simbolo");
		this.nome = token.image;
		this.tipo = tipo;
		this.token = token;
	}
	
	public Simbolo(Token token, TipoDado tipo, int referencia){
		this.nome = token.image;
		this.referencia = referencia;
		this.tipo = tipo;
		this.token = token;
	}
	
	public String getLexema(){
		return this.nome;
	}
	
	public TipoDado getTipo(){
		return this.tipo;
	}
	
	public String toString(){
		return "Nome: "+this.getLexema() + " | " + "Índice: "+this.getReferencia() + " | Tipo: " + 
				this.tipo + "\n";
	}
	
	
	
	/*private String nome;      // nome da variável
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
    }*/
    

}
