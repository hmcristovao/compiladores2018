package semantico;

import apoio.ErroSemantico;
import java.util.HashMap;
import parser.Token;

public class Tabela {

    private HashMap<String, Simbolo> tab;
    private int proximaReferencia;

    public Tabela() {
        this.tab = new HashMap<String, Simbolo>();
        this.setMarcador(1);
    }

    public void incluiSimbolo(Simbolo _simb) {
        if (this.tab.containsKey(_simb.getNome())) {
            throw new ErroSemantico("Erro: Simbolo " + _simb + " já existe");
        } else {
            _simb.setReferencia(proximaReferencia);
            this.tab.put(_simb.getNome(), _simb);

            if (_simb.getTipo().equals(TipoDado.NUM)) 
            	this.proximaReferencia += 2;
            else this.proximaReferencia++;
            
        }
    }

    public boolean verificaExistenciaSimbolo(Simbolo _simb) {
        return this.tab.containsKey(_simb);
    }

    public Simbolo consultaSimbolo(String _simb) {
        if(this.tab.containsKey(_simb)) return this.tab.get(_simb);
        else throw new ErroSemantico("Erro: Simbolo " + _simb + " não existe");
    }
    
    //RETIRAR FUTURAMENTE
    public boolean verificaExistenciaSimbolo(String _chave) {
        return this.tab.containsKey(_chave);
    }

    public int consultaReferencia(String _chave) {
        return ((Simbolo) this.tab.get(_chave)).getReferencia();
    }

    public TipoDado consultaTipo(String _tipo) {
        return TipoDado.getTipoDado(_tipo);
    }
    
    @Override
    public String toString() {
        return this.tab.toString();
    }

    public int getMarcador() {
        return this.proximaReferencia;
    }

    public void setMarcador(int marcador) {
        this.proximaReferencia = marcador;
    }

    public void adicionarTabela(Tabela tabela, Token t, TipoDado _tipo, int _ref) {
        if ((tabela.verificaExistenciaSimbolo(t.image))) {
            throw new ErroSemantico("Erro: variável " + t.image + " duplicada.");
        } else {
//        	System.out.println("TDado " + _tipo.toString() + ". Ref " + _ref);

        	if (_tipo.equals(TipoDado.NUM)) {// Contrutor com 3 ou 4 param
                Simbolo simb = new Simbolo(t, TipoDado.NUM, _ref);
                tabela.incluiSimbolo(simb);
            } else {
                Simbolo simb = new Simbolo(t, TipoDado.STR, _ref);
                tabela.incluiSimbolo(simb);
            }
//          System.out.println(tabela.toString());
        }
//        return tabela;
    }
}
