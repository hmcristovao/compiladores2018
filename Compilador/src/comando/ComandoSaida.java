package comando;
import geradorCodigo.*;
import parser.*;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoSaida extends ComandoAltoNivel
{
	private Expressao expressao;
	
	public ComandoSaida(Token _token, Expressao _expressao)
	{
		super(_token);
		this.expressao = _expressao;
	}

	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + this.getExpressao() + ">\n";
	}

	public Expressao getExpressao() 
	{
		return this.expressao;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() 
	{
		StringBuilder expDestAssemb = this.getExpressao().geraCodigoDestino();
		TipoDado tipo = this.getExpressao().tipoDadoExpressao();
		
//		System.out.println( this.getExpressao()  + expDestAssemb.toString() + "\n" + tipo);
		
		PrimitivoSaida comandoPrimitivo = new PrimitivoSaida( expDestAssemb, tipo );
		ListaComandosPrimitivos listaSaida = new ListaComandosPrimitivos();
		listaSaida.addComando(comandoPrimitivo);
	
		return listaSaida;
	}
}