package comandos;
import geradorCodigo.*;
import parser.*;
import primitivo.ListaComandosPrimitivos;

public class ComandoSaida extends ComandoAltoNivel{
	Expressao expressao;
	
	public ComandoSaida(Expressao exp, Token token) {
		super(token);
		this.expressao = exp;
	}
	
	public String toString() {
		return this.token+"/"+this.expressao.listaExpPosfixa;
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		return null; //THUG LIFE !!
	}	
	
}
