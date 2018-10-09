package comandos;
import parser.*;

public abstract class ComandoAltoNivel {
	public Token token;
	
	public ComandoAltoNivel(Token token) {
		this.token = token;
	}
	
	/*
	String getLexema() {
		//retorna o que, porra ??
	}
	
	abstract ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
	}
    
	*/
	public abstract String toString();
	
}
