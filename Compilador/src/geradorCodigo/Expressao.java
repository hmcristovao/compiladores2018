package geradorCodigo;
import java.util.LinkedList;

import comando.PrimitivoLabel;
import parser.Compilador;
import semantico.*;
import comando.*;

public class Expressao
{
	private LinkedList<Item> expressaoInfixa;
	private LinkedList<Item> expressaoPosfixa;

	public Expressao()
	{
		this.expressaoPosfixa = new LinkedList<Item>();
		this.expressaoInfixa = new LinkedList<Item>();
	}

	public LinkedList<Item> getExpressaoInfixa()
	{
		return this.expressaoInfixa;
	}

	public LinkedList<Item> getExpressaoPosfixa()
	{
		return this.expressaoPosfixa;
	}

	public void addItemInfixo(Item _item)
	{
		this.getExpressaoInfixa().add(_item);
	}

	public void addItemPosfixo(Item _item)
	{
		this.getExpressaoPosfixa().add(_item);
	}

	public StringBuilder geraCodigoDestino()
	{
		StringBuilder codigoDestino = new StringBuilder();
		Item item;
		Operando operando;
		Operador operador;
		String op_comando;
		char separador;
		int referencia, tamExp, refTempA, refTempB;;
		
		LinkedList<Item> expPosFixa = this.getExpressaoPosfixa(); 
	    tamExp = expPosFixa.size();
		for ( int i = 0; i < tamExp; i++ ) 
	    {
	    	item = expPosFixa.get(i);
			separador = ' ';	
	    	if ( item instanceof Operando )
	    	{
	    		operando = (Operando)item;
	    		
	    		switch ( operando.getTipoElemento() )
	    		{
	    			case VAR:
	    				referencia = Compilador.tabela.consultaReferencia( operando.getLexema() );
    					if ( referencia < 4 ) separador = '_';
	    				switch ( operando.getTipoDado() )
	    				{
	    					case NUM:
	    						codigoDestino.append("dload" + separador + referencia + "\n" );
	    						break;
	    					case STR:
	    						codigoDestino.append("aload" + separador + referencia + "\n" );
	    						break;
	    				}
	    				break;
	    			case CTE:
	    				switch ( operando.getTipoDado() )
	    				{
	    					case NUM:
	    						codigoDestino.append("ldc2_w " + Float.parseFloat(operando.getLexema()) + "\n" );
	    						break;
	    					case STR:
	    						codigoDestino.append("ldc " + operando.getLexema() + "\n" );
	    						break;
	    				}
	    				break;
	    		}
	    	} else if ( item instanceof Operador )	
	    	{
	    		operador = (Operador)item;
	    		switch ( operador.getTipoOperador() )
	    		{
	    			case ADD:
	    				op_comando = "dadd";
	    				break;
	    			case SUB:
	    				op_comando = "dsub";
	    				break;
	    			case MUL:
	    				op_comando = "dmul";
	    				break;
	    			case DIV:
	    				op_comando = "ddiv";
	    				break;
	    			case IGUAL:
	    				PrimitivoLabel labelFalse, labelFim;
	    				PrimitivoGoto goToLabelFim;
	    				labelFalse = new PrimitivoLabel("labelFalseExpRelacional");
	    				labelFim = new PrimitivoLabel("labelFimExpRelacional");
	    				goToLabelFim = new PrimitivoGoto(labelFim);
	    				
	    				if ( ((Operando)expPosFixa.get( i - 1 )).getTipoDado() == TipoDado.NUM )
	    				{
	    					op_comando = "dcmpg \nifne " + labelFalse.getLabel() + "\n";
		    				op_comando += "dconst_1 \ngoto " + goToLabelFim.getLabel() + "\n";
		    				op_comando += labelFalse.getLabel() + ": \ndconst_0\n" + labelFim.getLabel() + ":";	
	    				} else
	    				{
	    					
	    					refTempA = CodigoDestino.referenciaTemporaria( TipoDado.STR );
	    					refTempB = CodigoDestino.referenciaTemporaria( TipoDado.STR );
	    					
	    					op_comando = "astore " + refTempA + "\n" 
	    							   + "astore " + refTempB + "\n " + 
	    								 "\nnew java/lang/String \n"; //Retirei dup
	    					op_comando += "invokespecial java/lang/String/<init>()V\n";
	    					op_comando += "aload " + refTempA + "\n" 
	    							    + "aload " + refTempB + "\n";
	    					op_comando += "invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I\n";
	    					op_comando += "iconst_0\nif_icmpeq  " + labelFalse.getLabel() + "\n";
		    				op_comando += "dconst_0\ngoto " + goToLabelFim.getLabel() + "\n";
		    				op_comando += labelFalse.getLabel() + ":\ndconst_1\n" + labelFim.getLabel() + ":";
		    				CodigoDestino.liberarReferenciaTemporaria( TipoDado.STR );
		    				CodigoDestino.liberarReferenciaTemporaria( TipoDado.STR );
	    				}
	    				break;
	    			case CONCAT:
		    				refTempA = CodigoDestino.referenciaTemporaria( TipoDado.STR );
	    					refTempB = CodigoDestino.referenciaTemporaria( TipoDado.STR );
	    					
	    					op_comando  = "swap\nastore " + refTempA +"\nastore " +  refTempB + "\n";
		    				op_comando += "new java/lang/StringBuilder \ndup\n"; 
		    				op_comando += "invokespecial java/lang/StringBuilder/<init>()V\n";
		    				op_comando += "aload " + refTempA + "\n";
		    				op_comando += "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n"
		    							   + "aload " + refTempB + "\n" 
		    							   + "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n";
		    				op_comando += "invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;";
		    				CodigoDestino.liberarReferenciaTemporaria( TipoDado.STR );
		    				CodigoDestino.liberarReferenciaTemporaria( TipoDado.STR );
	    				break;
	    			case OU:
		    				PrimitivoLabel labelTrue, labelFimRelacional;
		    				PrimitivoGoto goToLabelFimRelacional;
		    				labelTrue = new PrimitivoLabel("labelTrue");
		    				labelFimRelacional = new PrimitivoLabel("labelFim");
		    				goToLabelFimRelacional = new PrimitivoGoto(labelFimRelacional);
		    				
		    				refTempA = CodigoDestino.referenciaTemporaria( TipoDado.NUM );
		    				op_comando  = "dstore " + refTempA + "\ndconst_0\ndcmpg\nifne " + labelTrue.getLabel() + "\n";
		    				op_comando += "dload " + refTempA + "\ndconst_0 \ndcmpg \nifne " + labelTrue.getLabel() + "\n";
		    				op_comando += "dconst_0 \ngoto " + goToLabelFimRelacional.getLabel() + "\n";
		    				op_comando += labelTrue.getLabel() + ":\ndconst_1\n";
		    				op_comando += labelFimRelacional.getLabel() + ":";
		    				CodigoDestino.liberarReferenciaTemporaria( TipoDado.NUM );
	    				  break;
	    			default:
	    				op_comando = "COMANDINHO NÂO IMPLEMENTADO";
	    		}
	    		codigoDestino.append( op_comando + "\n" );
	    	}
	    	
		}
				
		return codigoDestino;
	}

	public TipoDado tipoDadoExpressao()
	{
		return ((Operando)this.getExpressaoInfixa().getFirst()).getTipoDado();
	}
	
	public TipoElemento tipoElementoExpressao()
	{
		return ((Operando)this.getExpressaoInfixa().getFirst()).getTipoElemento();
	}
	
	public void limiteMaximoPilha()
	{
		int limiteMaximoPilha, tamExpPosFixa;
		Item item;
		
		tamExpPosFixa = expressaoPosfixa.size();
		limiteMaximoPilha = 1;
		
		for ( int i = 0; i < tamExpPosFixa; i++ ) 
		{
			item = expressaoPosfixa.get(i);
			if ( item instanceof Operando )
				limiteMaximoPilha  += Compilador.tabela.incrementoReferencia( ((Operando)item).getTipoDado() );
			else if ( item instanceof Operador )
			{
				limiteMaximoPilha -= 2*Compilador.tabela.incrementoReferencia( ((Operando)expressaoPosfixa.get(i-1)).getTipoDado() );
			}
				
		}
	}
	
	@Override
	public String toString()
	{
		return "{" + this.getExpressaoPosfixa() + "}" ;
	}
}