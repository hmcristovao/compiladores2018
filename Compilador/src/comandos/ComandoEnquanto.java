package comandos;
import geradorCodigo.*;
import primitivo.*;
import parser.*;
import primitivo.ListaComandosPrimitivos;

public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoEnquanto(Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(token);
		this.expressao = exp;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	public String toString() {
		return this.token + "/" + this.expressao.listaExpPosfixa + "/" + this.listaComandosAltoNivelTrue.listaComandosAltoNivel;
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		PrimitivoLabel labelInicio = new PrimitivoLabel("labelEnquanto");
		
		PrimitivoLabel labelFim = new PrimitivoLabel("fimEnquanto");
		
		PrimitivoSeExpFalsoGoto cmpFalse = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFim, this.listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		
		PrimitivoGoto vaipra = new PrimitivoGoto(labelInicio);
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		lista.addComando(labelInicio);
		
		lista.addComando(cmpFalse);
		
		lista.addComando(vaipra);
		
		lista.addComando(labelFim);		
		
				
		return lista;
	}
	
}
