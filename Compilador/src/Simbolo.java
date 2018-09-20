
public class Simbolo {
	private String nome;
	private String tipo;
	private int referencia;
	private static int marcador = 1;

    public Simbolo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        if ((tipo.equals("NUMERO"))||(tipo.equals("numero"))) {
        	this.referencia = Simbolo.marcador;
            Simbolo.marcador += 2;
        }
        else {
        	this.referencia = Simbolo.marcador;
            Simbolo.marcador += 1;
        }
        
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


	public static int getMarcador() {
		return marcador;
	}

	public String toString() {

	      return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()

	             + "\t" + "Referência:"+this.getReferencia();
	}

}
