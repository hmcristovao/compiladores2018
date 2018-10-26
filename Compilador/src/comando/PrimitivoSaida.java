package comando;

import parser.Compilador;
import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo
{

	private StringBuilder expDestinoAssembler;
	private TipoDado tipo; 
	
	public PrimitivoSaida(StringBuilder _expDestAssemb, TipoDado _tipo)
	{
		this.expDestinoAssembler = _expDestAssemb;
		this.tipo = _tipo;
	}
	
	@Override
	public StringBuilder geraCodigoDestino()
	{
		StringBuilder codigoDestino = new StringBuilder();
		codigoDestino.append("getstatic java/lang/System/out Ljava/io/PrintStream;\r\n");
		codigoDestino.append(this.getExpDestinoAssembler());
		String paramExibicao = new String();
		
		switch( this.getTipo() )
		{
			case STR:
				paramExibicao = "Ljava/lang/String;";
				break;
				
			case NUM:
				paramExibicao = "D";
				break;
		}
		
		codigoDestino.append("invokevirtual java/io/PrintStream/print(" + paramExibicao + ")V\r\n" );
		
		return codigoDestino;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		//return this.expDestinoAssembler+"("+this.getTipo()+")";
		return "saida(" + this.getTipo() + ")\n";
}
	
	
	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public StringBuilder getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
}
