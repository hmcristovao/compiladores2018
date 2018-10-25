package semantico;

import apoio.ErroSemantico;
import java.util.HashMap;
import parser.Token;

public class Tabela {

    private HashMap<String, Simbolo> tab;
    private int proximaReferencia;

    public Tabela() {
        this.tab = new HashMap<String, Simbolo>();
        this.proximaReferencia = 1;
    }

    public void incluiSimbolo(Simbolo _simb) {
        if (this.tab.containsKey(_simb.getNome())) {
            throw new ErroSemantico("Erro Semantico " + _simb.getNome() + " ja declarado");
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
        else throw new ErroSemantico("Erro Semantico " + _simb + " nao declarado");
    }
    

    public int consultaReferencia(String _chave) {
        return ((Simbolo) this.tab.get(_chave)).getReferencia();
    }

    public TipoDado consultaTipo(String _tipo) {
    	return TipoDado.getTipoDado(_tipo);
    }
    
    public String toString() {
        return this.tab.toString();
    }
}
