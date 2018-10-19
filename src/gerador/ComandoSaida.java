package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoEntrada;
import primitivo.PrimitivoSaida;
import semantico.Operando;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoSaida extends ComandoAltoNivel {

    private Expressao expressao;

    public ComandoSaida(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos saida = new ListaComandosPrimitivos();
		
		PrimitivoSaida primitivoSaida = new PrimitivoSaida(TipoDado.NUM, expressao.toString());
		saida.addComando(primitivoSaida);
		
		return saida;
	}

    @Override
    public String toString() {
    	return "\n\nComando Exibe:" + this.expressao.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

}
