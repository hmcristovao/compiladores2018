package semantico;
import java.util.HashMap;

public class Tabela {
	
	private HashMap<String, Simbolo> tabela;
	private int proximaReferencia;
	
	public Tabela(){
		this.tabela = new HashMap<String, Simbolo>();
	}
	
	public void incluiSimbolo(Simbolo simbolo){
		this.tabela.put(simbolo.getLexema(), simbolo);
	}
	
	public boolean verificaExistenciaSimbolo(String simbolo){
		if(this.tabela.containsKey(simbolo)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public Simbolo consultaSimbolo(String simbolo){
		Simbolo retorno = this.tabela.get(simbolo);
		return retorno;
	}
	
	public int consultaReferencia(String simbolo){
		return this.tabela.get(simbolo).getReferencia();
	}
	
	public TipoDado consultaTipo(String simbolo){
		return this.tabela.get(simbolo).getTipo();
	}
	
	public String toString(){
		return this.tabela.toString();
	}

	public int getProximaReferencia() {
		return proximaReferencia;
	}

	public void setProximaReferencia(int proximaReferencia) {
		this.proximaReferencia = proximaReferencia;
	}
	
	
	/*private HashMap<String,Simbolo> tab;
    public Tabela() {
    	
    	  this.tab = new HashMap<String,Simbolo>();
    }
    public boolean inclui(Simbolo _simb) {
          if(this.tab.containsKey(_simb.getNome()))
                return false;
          else {
        	  	_simb.setReferencia();
        	  	
                this.tab.put(_simb.getNome(),_simb);
                return true;
          }
    }
    public int consultaReferencia(String _chave) {
          return ((Simbolo)this.tab.get(_chave)).getReferencia();
    }
    public boolean isExiste(String _chave) {
          return this.tab.containsKey(_chave);
    }
    public String toString() {
          return this.tab.toString();

    }*/
}
