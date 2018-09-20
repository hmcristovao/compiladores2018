
public class Simbolo {
	private String nome;
	private String tipo;
	private int referencia;


    public Simbolo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
  }

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}


	public int getReferencia() {
		return referencia;
	}

	
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	
	public String toString() {

	      return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()

	             + "\t" + "Referência:"+this.getReferencia();
	}

}
