package comandos;
import parser.*;
import primitivo.*;

public abstract class ComandoAltoNivel {
	public Token token;
	
	public ComandoAltoNivel(Token token) {
		this.token = token;
	}
	
	/*
	String getLexema() {
	}
	*/
	abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
    
	
	public abstract String toString();
	
}
