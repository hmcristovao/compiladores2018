package comando;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo
{
	private int referencia;
	private TipoDado tipo;
	private StringBuilder expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, StringBuilder _expDestAssemb)
	{
		this.referencia = _referencia;
		this.tipo = _tipo;
		this.expDestinoAssembler = _expDestAssemb;
	}
	
	@Override
	public StringBuilder geraCodigoDestino() 
	{
		StringBuilder codigoDestino = new StringBuilder();
		char separador, prefixoAtrib;
		
		separador = '_';
		if ( this.getReferencia() > 3 ) separador = ' ';
		
		switch ( this.getTipo() )
		{
			case NUM:
				prefixoAtrib = 'd';
				break;
			case STR:
				prefixoAtrib = 'a';
				break;
			default:
				prefixoAtrib = ' ';
		}
		
		codigoDestino.append( ";\tINICIO ATRIBUICAO \n" + this.getExpDestinoAssembler().toString()  
							 + prefixoAtrib + "store" + separador + this.getReferencia() 
							 + "\n;\tFIM ATRIBUICAO\n");
		return codigoDestino;
	}

	@Override
	public String toString()
	{
		return "atrib("+this.getTipo() + ";" + this.getReferencia() + "; expDestinoAssembly )\n";
	}

	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public int getReferencia()
	{	
		return this.referencia;
	}
	
	public StringBuilder getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
}
