package semantico;
import parser.*;

public class Simbolo {	
	private String nome;
	Token token;
	public TipoDado tipo;
	private int referencia;
	
	public Simbolo(String nome, TipoDado tipo, int ref) {
		this.nome = nome;
		this.tipo = tipo;
		this.referencia = ref;
	}
	
	public String toString() {
	  return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:" + 
			  this.getTipo() + "\t" + "Referência:"+this.getReferencia();
	  }
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoDado getTipo() {
		return this.tipo;
	}
	
	public void setReferencia(Tabela tab, TipoDado tipo) {

		if(tipo.equals(TipoDado.NUM)) {
			tab.marcador+=2;
		}			
		else if(tipo.equals(TipoDado.STR))
			tab.marcador+=1;
		
	}
	
	public int getReferencia(){
		return this.referencia;
	}
	

	
}
