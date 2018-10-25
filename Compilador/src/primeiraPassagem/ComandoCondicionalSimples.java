package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
import segundaPassagem.*;
public class ComandoCondicionalSimples extends ComandoCondicional{

	public ComandoCondicionalSimples(Expressao _expressao, ListaComandoAltoNivel _listaComandoAltoNivelTrue, Token _token){
		super(_expressao, _listaComandoAltoNivelTrue,_token);
	}
	
	public String toString() {
		return super.getLexema() + super.expressao.toString() + super.listaComandoAltoNivelTrue.toString();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoSeExpFalsoGoto primitivoSeExpFalsoGoto = new PrimitivoSeExpFalsoGoto(super.expressao.geraCodigoDestino(),labelFalse,super.listaComandoAltoNivelTrue.geraListaComandosPrimitivosTotal());
		lista.addComando(primitivoSeExpFalsoGoto);
		lista.addComando(labelFalse);
		return lista;
	}
}
