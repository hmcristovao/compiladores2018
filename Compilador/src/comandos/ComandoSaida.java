package comandos;
import geradorCodigo.*;
import primitivo.*;
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
	
	public ComandoPrimitivo geraListaComandosPrimitivos() {
		return null; //THUG LIFE !!
	}	
	
}
