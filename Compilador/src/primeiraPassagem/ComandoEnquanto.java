package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
import segundaPassagem.*;
public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandoAltoNivel listaComandoAltoNivelTrue;
	
	public ComandoEnquanto(Expressao _expressao,ListaComandoAltoNivel _listaComandoAltoNivelTrue, Token _token) {
		super(_token);
		this.expressao=_expressao;
		this.listaComandoAltoNivelTrue=_listaComandoAltoNivelTrue;	
	}
	
	public String toString() {
		return super.getLexema() + this.expressao.toString() + this.listaComandoAltoNivelTrue.toString();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoLabel labelGoto = new PrimitivoLabel("LabelGoto");
		PrimitivoGoto _goto = new PrimitivoGoto(labelGoto);
		PrimitivoSeExpFalsoGoto primitivoSeExpFalsoGoto = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(),labelFalse,this.listaComandoAltoNivelTrue.geraListaComandosPrimitivosTotal());
		lista.addComando(labelGoto);
		lista.addComando(primitivoSeExpFalsoGoto);
		lista.addComando(_goto);
		lista.addComando(labelFalse);
		return lista;
	}
}
