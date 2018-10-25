package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoAtribuicao;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoAtribuicao extends ComandoAltoNivel {

	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Token _token, Simbolo _simbolo, Expressao _expressao) {
		super(_token);
		this.variavel = _simbolo;
		this.expressao = _expressao;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipo();
		
		PrimitivoAtribuicao comandoPrimitivo = new PrimitivoAtribuicao(referencia, tipo, this.expressao.geraCodigoDestino());
		ListaComandosPrimitivos comandoAtribuicao = new ListaComandosPrimitivos();
		comandoAtribuicao.addComando(comandoPrimitivo);
		
		return comandoAtribuicao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando atribuição\n" +"Variavel " + this.variavel.getLexema() + " recebe " + this.expressao.getListaExpPosfixa();
	}
}
