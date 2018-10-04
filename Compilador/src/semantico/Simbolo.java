package semantico;

public class Simbolo {
	private String nome;
	// nome do identificador

	private Tipo tipo;
	// é uma enumeração que deve ser criada para 
	// representar os tipos usados na linguagem

   private int referencia;
   // é uma referência usada na geração do
   // código destino

   public String toString() {
      return "\t"+"Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()+ "\t" + "Referência:"+this.getReferencia()+"\n";
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
}
