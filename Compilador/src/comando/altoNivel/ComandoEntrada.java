package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoAtribuicao;
import comando.primitivo.PrimitivoEntrada;
import parser.Token;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoEntrada extends ComandoAltoNivel {

	Simbolo variavel;
	
	public ComandoEntrada(Token _token,Simbolo _simbolo) {
		super(_token);
		this.variavel = _simbolo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando leitura\n" +"Variavel " + this.variavel.getLexema()
		;
	}
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipo();
		
		PrimitivoEntrada comandoPrimitivo = new PrimitivoEntrada(referencia, tipo);
		ListaComandosPrimitivos comandoEntrada = new ListaComandosPrimitivos();
		comandoEntrada.addComando(comandoPrimitivo);
		
		return comandoEntrada;
	}

}
