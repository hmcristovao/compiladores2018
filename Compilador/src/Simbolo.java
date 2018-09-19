public class Simbolo {
	private String nome;
	// nome do identificador

	private Tipo tipo;
	// é uma enumeração que deve ser criada para 
	// representar os tipos usados na linguagem

   private int referencia;
   // é uma referência usada na geração do
   // código destino

   private static int marcador = 1; // armazena a última referência
   // incluída na tabela
 
   public String toString() {
      return "\t"+"Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()+ "\t" + "Referência:"+this.getReferencia()+"\n";
   }
   
   public static int incMarcador(String tipo) {
	   if(tipo.equals(Tipo.PALAVRA.getNome())) {
		   marcador = marcador+1;
		   return marcador-1;
	   }else if(tipo.equals(Tipo.NUMERO.getNome())) {
		   marcador = marcador+2;
		   return marcador-2;
	   }else {
		   return 0; //necessario? 
	   }
   }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public int getReferencia() {
		return referencia;
	}
	
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	
	public static int getMarcador() {
		return marcador;
	}
	
	public static void setMarcador(int marcador) {
		Simbolo.marcador = marcador;
	}
}
