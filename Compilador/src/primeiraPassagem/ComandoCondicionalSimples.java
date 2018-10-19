package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
public class ComandoCondicionalSimples extends ComandoCondicional{

	public ComandoCondicionalSimples(Expressao _expressao, ListaComandoAltoNivel _listaComandoAltoNivelTrue, Token _token){
		super(_expressao, _listaComandoAltoNivelTrue,_token);
	}
	
	public String toString() {
		return super.getLexema() + super.expressao.toString() + super.listaComandoAltoNivelTrue.toString();
	}
}