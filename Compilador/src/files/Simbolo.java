package files;

public class Simbolo {

	private String nome;      // nome do identificador
	
	private String tipo;        // é uma enumeração que deve ser criada para 
	                          // representar os tipos usados na linguagem

	private int referencia;   // é uma referência usada na geração do código destino

	private static int marcador = 1; // armazena a última referência incluída na tabela
		

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getReferencia() {
		return referencia;
	}

	public void setReferencia() {
		this.referencia = marcador;
	}
	
	
	public static void incrementaMarcador(String tipo) {
				
		if(tipo.equals("numero")) {
			
			marcador+=2;
		}
		if(tipo.equals("palavra")) {
			marcador+=1;
		}
	}
	
	public String toString() {

	      return "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()

	             + "\t" + "Referência:"+this.getReferencia() + "\n";

	 }
	 
}
