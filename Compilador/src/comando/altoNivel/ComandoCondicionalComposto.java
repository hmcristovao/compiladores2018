package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoGoto;
import comando.primitivo.PrimitivoLabel;
import comando.primitivo.PrimitivoSeExpFalsoGoto;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalComposto extends ComandoCondicional {

	public ComandoCondicionalComposto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token, _expressao, _listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		PrimitivoLabel labelInicio = new PrimitivoLabel("True");
		PrimitivoLabel labelFalse = new PrimitivoLabel("False");
		PrimitivoLabel labelFim = new PrimitivoLabel("Fim");
		PrimitivoGoto primitivoGoto = new PrimitivoGoto(labelFim);
		ListaComandosPrimitivos listaTrue = this.listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal();
		PrimitivoSeExpFalsoGoto seExpFalseGoto = new PrimitivoSeExpFalsoGoto("expAssembler", labelFalse, listaTrue);
		
		ListaComandosPrimitivos primitivoCondicionalSimples = new ListaComandosPrimitivos();
		primitivoCondicionalSimples.addComando(seExpFalseGoto);
		primitivoCondicionalSimples.addComando(primitivoGoto);
		primitivoCondicionalSimples.addComando(labelFalse);
		return null;
	}

}
