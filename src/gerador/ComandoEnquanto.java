package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoGoto;
import primitivo.PrimitivoLabel;
import primitivo.PrimitivoSeExpFalsoGoto;
import semantico.Simbolo;

public class ComandoEnquanto extends ComandoAltoNivel {

    private Expressao expressao;
    private ListaComandosAltoNivel listaComandosAltoNivelTrue;

    public ComandoEnquanto(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos enquanto = new ListaComandosPrimitivos();
		
		PrimitivoLabel Linicio= new PrimitivoLabel("LabelInicio");
		PrimitivoLabel Lfalse = new PrimitivoLabel("LabelFalse");	
		PrimitivoSeExpFalsoGoto primitivoEnquanto = new PrimitivoSeExpFalsoGoto(expressao.toString(), Lfalse, listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		PrimitivoGoto gotoEnquanto = new PrimitivoGoto(Linicio);
		
		enquanto.addComando(Linicio);
		enquanto.addComando(primitivoEnquanto);
		enquanto.addComando(gotoEnquanto);
		enquanto.addComando(Lfalse);
		
		
		return enquanto;
	}

    @Override
    public String toString() {
    	return "Comando Enquanto:" + this.expressao.toString() 
    		 + "\nLista de Comandos True:" + this.listaComandosAltoNivelTrue.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
        return listaComandosAltoNivelTrue;
    }

}
