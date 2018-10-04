package semantico;


public class Simbolo {
	private String nome;
	private Tipo tipo;
	private int referencia;


    public Simbolo(String nome, Tipo tipo) {
        this.nome = nome;
        this.setTipo(tipo);
  }

	public String getNome() {
		return this.nome;
	}


	public int getReferencia() {
		return this.referencia;
	}

	
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	
	public String toString() {

	      return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()

	             + "\t" + "Referência:"+this.getReferencia();
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
