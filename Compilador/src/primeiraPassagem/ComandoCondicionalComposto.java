package primeiraPassagem;

import geradorCodigo.Expressao;
import parser.Token;
import segundaPassagem.*;

public class ComandoCondicionalComposto extends ComandoCondicional{
	public ListaComandoAltoNivel listaComandoAltoNivelFalse;
	
	public ComandoCondicionalComposto(Expressao _expressao, ListaComandoAltoNivel _listaComandoAltoNivelTrue, ListaComandoAltoNivel _listaComandoAltoNivelFalse, Token _token){
		super(_expressao, _listaComandoAltoNivelTrue,_token);
		this.listaComandoAltoNivelFalse=_listaComandoAltoNivelFalse;
	}
	
	public String toString() {
		return super.expressao.toString() + super.listaComandoAltoNivelTrue.toString() + this.listaComandoAltoNivelFalse.toString();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoLabel labelTrue = new PrimitivoLabel("LabelTrue");
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoGoto _goto = new PrimitivoGoto(labelTrue);
		PrimitivoSeExpFalsoGoto primitivoSeExpFalsoGoto = new PrimitivoSeExpFalsoGoto(" ",labelFalse,super.listaComandoAltoNivelTrue.geraListaComandosPrimitivosTotal());
		lista.addComando(primitivoSeExpFalsoGoto);
		lista.addComando(_goto);
		lista.addComando(labelFalse);
		lista.addComando(labelTrue);
		return lista;
	}
}
