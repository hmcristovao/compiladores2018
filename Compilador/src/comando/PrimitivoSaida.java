package comando;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo
{

	private String expDestinoAssembler;

	private TipoDado tipo; //tipo de dado da express�o?
	//onde pega isso??? express�o nao possui tipo, teria ent�o que acessar um item da lista
	//de itens da expressao e ver o tipo? mas qual item seria
	
	public PrimitivoSaida(String _expDestAssemb, TipoDado _tipo)
	{
		this.expDestinoAssembler = _expDestAssemb;
		this.tipo = _tipo;
	}
	
	@Override
	public String geraCodigoDestino()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		//return this.expDestinoAssembler+"("+this.getTipo()+")";
		return "saida(" + this.getTipo() + ")";
}
	
	
	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public String getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
}
