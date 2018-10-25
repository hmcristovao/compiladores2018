package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoGoto;
import comando.primitivo.PrimitivoLabel;
import comando.primitivo.PrimitivoSeExpFalsoGoto;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {

	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoEnquanto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivelTrue = _listaComandosAltoNivel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando Enquanto\n" +"Enquanto expressao " + this.expressao.toString() +" Lista de Comandos: "+  listaComandosAltoNivelTrue;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		// TODO Auto-generated method stub
		PrimitivoLabel labelInicio = new PrimitivoLabel("True");
		PrimitivoLabel labelFalse = new PrimitivoLabel("False");
		PrimitivoGoto primitivoGoto = new PrimitivoGoto(labelInicio);
		ListaComandosPrimitivos listaTrue = this.listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal();
		PrimitivoSeExpFalsoGoto seExpFalseGoto = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaTrue);
		
		ListaComandosPrimitivos primitivoEnquanto = new ListaComandosPrimitivos();
		primitivoEnquanto.addComando(labelInicio);
		primitivoEnquanto.addComando(seExpFalseGoto);
		primitivoEnquanto.addComando(primitivoGoto);
		primitivoEnquanto.addComando(labelFalse);
		return primitivoEnquanto;
	}
}
