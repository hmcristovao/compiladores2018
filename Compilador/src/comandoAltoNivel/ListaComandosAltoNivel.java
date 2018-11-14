package comandoAltoNivel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import comandoPrimitivo.ComandoPrimitivo;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Compilador;
import semantico.Simbolo;

public class ListaComandosAltoNivel {
	
	private LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	
	public ListaComandosAltoNivel() {
		this.listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();   
	}
	
	public void addComando(ComandoAltoNivel comando) {
		this.listaComandosAltoNivel.add(comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return this.listaComandosAltoNivel;
	}
	
	public ListaComandosPrimitivos geraListaComandoPrimitivosCompleta() {		
		ListaComandosPrimitivos listaComandosPrimitivosCompleta = new ListaComandosPrimitivos();
		for(ComandoAltoNivel comando : listaComandosAltoNivel ){
			ListaComandosPrimitivos listaComandosPrimitivos = comando.geraListaComandosPrimitivos();
			for(ComandoPrimitivo comandoPrimitivo : listaComandosPrimitivos.getListaComandosPrimitivos()){
				listaComandosPrimitivosCompleta.addComando(comandoPrimitivo);
			}
		}
		
		//percorrer tabela de simbolos verificando o isInicializada de cada variavel
		Set<String> chaves = Compilador.tabela.tab.keySet();
		for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();)
		{
			String chave = iterator.next();
			if(chave != null) {
				Simbolo simboloAux = Compilador.tabela.pesquisaTabela(chave);
				if(simboloAux.getIsUtilizada() == false && simboloAux.getIsInicializada() == true) {
					System.out.println("Warning: Variavel "+chave + " declarada, inicializada, mas não utilizada.");
				}
			}
		}
		
		return listaComandosPrimitivosCompleta;	
	}
	
	
	
	@Override
	public String toString() {
		return  this.listaComandosAltoNivel.toString();
	}
	


}
