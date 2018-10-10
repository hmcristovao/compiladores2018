package comandos;
import semantico.*;
import parser.*;

public class ComandoEntrada extends ComandoAltoNivel{
	Simbolo simbolo;
	
	public ComandoEntrada(Simbolo simbolo, Token token){
		super(token);  		
		this.simbolo = simbolo;
	}
	
	public String toString() {
		return this.token + "/" + this.simbolo.getNome();
	}
	
}
