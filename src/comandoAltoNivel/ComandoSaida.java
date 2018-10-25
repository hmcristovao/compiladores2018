package comandoAltoNivel;
import java.util.LinkedList;

import comandoPrimitivo.*;
import gerador.*;
import parser.Token;
import semantico.*;

public class ComandoSaida extends ComandoAltoNivel {

    private Expressao expressao;

    public ComandoSaida(Token token, Expressao expressao) {
    	super(token);
		this.expressao = expressao;
	}

    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaPrimitivaSaida = new ListaComandosPrimitivos();
		Item item;
		item = expressao.getExpressaoPosfixa().getFirst();
		Operando op = (Operando) item;
		
		
		PrimitivoSaida primitivoSaida = new PrimitivoSaida(expressao.geraCodigoDestino(), op.getTipoDado());
		System.out.println(op.getTipoDado());
		listaPrimitivaSaida.addComando(primitivoSaida);
		
		return listaPrimitivaSaida;
	}

    
    public String toString() {
    	return "\n\nComando Exibe:" + this.expressao.toString();
    }
}