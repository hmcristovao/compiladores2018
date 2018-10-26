package comando;
import parser.*;
import geradorCodigo.*;

public class ComandoCondicionalSimples extends ComandoCondicional
{

	public ComandoCondicionalSimples(Token _token, Expressao _exp, ListaComandosAltoNivel _listaTrue)
	{
		super(_exp, _token, _listaTrue);
	}


	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + this.getExpressao() +", " + this.getListaComandosAltoNivelTrue() + ">\n";
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() 
	{
		ListaComandosPrimitivos listaCmdCondicionalSimples = new ListaComandosPrimitivos();
		ListaComandosPrimitivos listaCmdPriTrue = super.getListaComandosAltoNivelTrue().geraListaComandoPrimitivosTotal();
		
		PrimitivoLabel labelfalse = new PrimitivoLabel("LabelFalse");
		PrimitivoSeExpFalsoGoto seExpFalseGoto = new PrimitivoSeExpFalsoGoto(labelfalse, this.getExpressao().geraCodigoDestino() , listaCmdPriTrue);
		listaCmdCondicionalSimples.addComando(seExpFalseGoto);
		listaCmdCondicionalSimples.addComando(labelfalse);
		
		return listaCmdCondicionalSimples;
	}
}