package comando;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo
{

	private int referencia;
	private TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo)
	{
		this.referencia = _referencia;
		this.tipo = _tipo;
	}
	
	@Override
	public StringBuilder geraCodigoDestino() 
	{
		StringBuilder codigoDestino = new StringBuilder();
		int referenciaVariavel = this.getReferencia();
		char separador = ' ', prefixoLoad;
		if ( referenciaVariavel < 4 ) separador = '_';
		String paramEntrada, tipoRetorno;
		
		switch( this.getTipo() )
		{
			case STR:
				paramEntrada = "Line";
				tipoRetorno = "Ljava/lang/String;";
				prefixoLoad = 'a';
				break;
			case NUM:
				paramEntrada = "Double";
				tipoRetorno = "D";
				prefixoLoad = 'd';
				break;
			default:
				paramEntrada = tipoRetorno = "";
				prefixoLoad = ' ';
		}
		
		codigoDestino.append( "new java/util/Scanner \ndup \ngetstatic java/lang/System/in Ljava/io/InputStream;\n" + 
							  "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n");
		codigoDestino.append("astore_0 \n");
		codigoDestino.append("aload_0 \n");
		codigoDestino.append("invokevirtual java/util/Scanner/next" + paramEntrada + "()" + tipoRetorno + "\n");
		
		codigoDestino.append( prefixoLoad + "store" + separador + referenciaVariavel + "\n"); 
		return codigoDestino;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "entrada("+this.getTipo()+";"+this.getReferencia()+")\n";
	}
	
	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public int getReferencia()
	{
		return this.referencia;
	}
	
}
