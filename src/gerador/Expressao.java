package gerador;

import java.util.LinkedList;

import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.TipoDado;

public class Expressao {

    private LinkedList<Item> expressaoInfixa;
    private LinkedList<Item> expressaoPosfixa;

    public Expressao() {
        expressaoInfixa = new LinkedList<Item>();
        expressaoPosfixa = new LinkedList<Item>();
    }

    public LinkedList<Item> getListaExpressaoInFixa() {
        return this.expressaoInfixa;
    }

    public void setListaExpressaoInfixa(LinkedList<Item> listaExpInfixa) {
        this.expressaoInfixa = listaExpInfixa;
    }

    public LinkedList<Item> getListaExpressaoPosFixa() {
        return this.expressaoPosfixa;
    }
    

    public void setListaExpressaoPosFixa(LinkedList<Item> listaExpPosFixa) {
        this.expressaoPosfixa = listaExpPosFixa;
    }

    public void addItemInfixo(Item _item) {
        expressaoInfixa.add(_item);
    }

    public void addItemPosfixo(Item _item) {
        expressaoPosfixa.add(_item);
    }
    
    //  Une a segunda exp a primeira, retorna a primeira contendo as duas
    public Expressao concatExpressoes(Expressao _exp1, Expressao _exp2) {
    	_exp1.expressaoInfixa.addAll(_exp2.expressaoInfixa);
       	_exp1.expressaoPosfixa.addAll(_exp2.expressaoPosfixa);
    	return _exp1;
    }

    public String geraCodigoDestino() {
        return null;
    }

    public String strExpPosfixa() {
        String saida = "";
        for (Item item : this.expressaoPosfixa) {
            if(item instanceof Operador) saida += ((Operador) item).toString();
            else  saida += ((Operando) item).toString();
        }
        return saida;
    }

    @Override
    public String toString() {
        return "\n\tExpressao Posfixa: " + this.expressaoPosfixa.toString()
        	 + "\n\tExpressao Infixa: " + this.expressaoInfixa.toString();
    }

    /*

    public TipoOperador getTipoOperador() {
        return this.getListaExpressaoInfixa().get(0).getTipoOperador();
    }

    public void addListaPos(String valor, Tipo tipo) {
        Item item = new Item();
        item.setTipo(tipo);
        item.setValor(valor);
        expressaoPosfixa.add(item);
    }

    public void addListaInf(String valor, Tipo tipo) {
        Item item = new Item();
        item.setTipo(tipo);
        item.setValor(valor);
        expressaoInfixa.add(item);
    }
     */
}
