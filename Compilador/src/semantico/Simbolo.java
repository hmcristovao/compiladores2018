package semantico;
import parser.*;

public class Simbolo {	
	private String nome;
	Token token;
	public TipoDado tipo;
	private int referencia;
	
	public Simbolo(String nome, TipoDado tipo) {
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

	public TipoDado getTipo() {
		return tipo;
	}
	
	public int getReferencia(){
		return referencia;
	}
	
	public void setReferencia(Tabela tab, TipoDado tipo) {
		//System.out.println(tipo);
		this.referencia = tab.marcador;
		
		if(tipo.equals(TipoDado.NUM)) {
			tab.marcador+=2;
		}			
		else if(tipo.equals(TipoDado.STR))
			tab.marcador+=1;
		
	}
	
}
