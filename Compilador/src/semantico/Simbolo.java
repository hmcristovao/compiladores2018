package semantico;

public class Simbolo {
      
	private String nome;      // nome da variavel
    private int referencia;   // referencia usada na geracao do codigo destino
    private static int marcador = 1; // armazena a ultima referencia incluida na tabela

    public Simbolo(String _nome) {
    	this.nome = _nome;
    	this.referencia = Simbolo.marcador;
        Simbolo.marcador += 2;
    }
      
    public String getNome() {
    	return this.nome;
    }

    public int getReferencia() {
    	return this.referencia;
    }

    public String toString() {
    	return "Nome:"+this.getNome() + " / " + "Referencia:"+this.getReferencia() + "\n";
    }
}