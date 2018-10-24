package comandos;
import geradorCodigo.*;
import primitivo.*;
import semantico.Item;
import semantico.Operando;
import parser.*;

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
		String exp = this.expressao.geraCodigoDestino();	
		Item item = this.expressao.listaExpPosfixa.get(0);
		Operando op = (Operando) item;
		
		ComandoPrimitivo prim = new PrimitivoSaida(exp, op.getTipoDado()); 
		
		return prim;
	 }
	
}
