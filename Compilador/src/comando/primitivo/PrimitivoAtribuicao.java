package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, String string) {
		this.referencia = _referencia;
		this.tipo = _tipo;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null; /*"Comando atribuição\n" +"Variavel " + this.variavel.getLexema() + " recebe " + this.expressao.getListaExpPosfixa();*/
	}

	//public abstract ListaComandosAltoNivel geraListaComandosAltoNivel();
}
