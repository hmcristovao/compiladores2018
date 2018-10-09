package semantico;

public class Simbolo {
	
	private String nome;
	private Tipo tipo;
	private int referencia;
	
	public Simbolo(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;	
	}
	
	public String toString() {
	  return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:" + 
			  this.getTipo() + "\t" + "Referência:"+this.getReferencia();
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
	
	public int getReferencia(){
		return referencia;
	}
	
	public void setReferencia(Tabela tab, Tipo tipo) {
		
		this.referencia = tab.marcador;
		
		if(tipo.equals("numero"))
			tab.marcador+=2;
		else if(tipo.equals("palavra"))
			tab.marcador+=1;
		
	}
	
}
