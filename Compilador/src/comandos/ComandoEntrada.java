package comandos;
import semantico.*;
import parser.*;

public class ComandoEntrada extends ComandoAltoNivel{
	Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo, Token token){
		super(token);  		
		this.simbolo = simbolo;
	}
	
	/*
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
	}	
	*/
	public String toString() {
		return this.simbolo + "";
	}
	
}
