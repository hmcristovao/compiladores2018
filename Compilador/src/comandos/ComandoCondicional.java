package comandos;
import geradorCodigo.*;
import primitivo.*;
import parser.*;

public class ComandoCondicional extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoCondicional(Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(token);
		this.expressao = exp;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	public String toString() {
		return this.token + "/" + this.expressao.listaExpPosfixa + "/";
	}	
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		PrimitivoLabel labelFim = new PrimitivoLabel("fimSe");
		
		PrimitivoSeExpFalsoGoto deuRuim = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFim, this.listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		lista.addComando(deuRuim);
			
		lista.addComando(labelFim);		
		
		return lista;
		
	}

}

