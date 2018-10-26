package comando;
import parser.*;
import semantico.*;
import geradorCodigo.*;

public class ComandoEnquanto extends ComandoAltoNivel
{
	private Expressao expressao;
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;

	public ComandoEnquanto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaTrue)
	{
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivelTrue = _listaTrue;
	}

	@Override
	public String toString()
	{
		return "<" + this.getLexema() + "," + this.getExpressao() + ", " + this.getListaComandosAltoNivelTrue() + ">\n";
	}

	public Expressao getExpressao()
	{
		return this.expressao;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() 
	{
		return this.listaComandosAltoNivelTrue;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{
		ListaComandosPrimitivos listaCmdEnqt = new ListaComandosPrimitivos();
		ListaComandosPrimitivos listaCmdPriTrue = this.listaComandosAltoNivelTrue.geraListaComandoPrimitivosTotal();
		
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoLabel labelInicio = new PrimitivoLabel("LabelInicio");
		PrimitivoGoto labelGoto =  new PrimitivoGoto(labelInicio);
		PrimitivoSeExpFalsoGoto seExpFalseGoto = new PrimitivoSeExpFalsoGoto(labelFalse, this.getExpressao().geraCodigoDestino(), listaCmdPriTrue);
		listaCmdEnqt.addComando(labelInicio);
		listaCmdEnqt.addComando(seExpFalseGoto);
		listaCmdEnqt.addComando(labelGoto);
		listaCmdEnqt.addComando(labelFalse);
		
		return listaCmdEnqt;
	}
}