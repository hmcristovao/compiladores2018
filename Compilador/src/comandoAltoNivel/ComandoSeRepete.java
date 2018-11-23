package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoGoto;
import comandoPrimitivo.PrimitivoLabel;
import comandoPrimitivo.PrimitivoSeExpFalsoGoto;
import parser.Compilador;
import parser.Token;
import semantico.Expressao;
import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.Sinal;
import semantico.TipoDado;
import semantico.TipoElemento;
import semantico.TipoOperador;

public class ComandoSeRepete extends ComandoAltoNivel{
	private Expressao exp;
	private Token repete_n;
	Item item;
	private ListaComandosAltoNivel lista_escopo_SeRepete;
	
	public ComandoSeRepete(Expressao exp, Token repete_n, Item item, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.exp = exp;
		this.repete_n = repete_n;
		this.item = item;
		this.lista_escopo_SeRepete = listaComandosAltoNivelTrue;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//união do comando se com o comando "repeat"
		//caso a expressao do primeiro parametro seja verdadeira (IF)
		//entramos em um loop que executa n vezes (repeat)
		
		//criacao do comando repeat
		ComandoRepeat cmdRepete = new ComandoRepeat(lista_escopo_SeRepete, repete_n, item);		
		
		PrimitivoLabel labelFalse = new PrimitivoLabel("LABEL_FALSE_SE_REPETE");
		//se as condições do if nao forem satisfeitas dá um salto para a labelFalse
		PrimitivoSeExpFalsoGoto comando = new PrimitivoSeExpFalsoGoto(this.exp.geraCodigoDestino(), 
				labelFalse, cmdRepete.geraListaComandosPrimitivos());
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		lista.addComando(comando);
		lista.addComando(labelFalse);
		
		return lista;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
