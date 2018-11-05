package semantico;

import parser.Token;

public class Operando extends Item {

	TipoDado tipoDado;
	TipoElemento tipoElemento;
	Sinal sinal; 

	public Operando(TipoDado tipoDado, TipoElemento tipoElemento, Token token, Sinal sinal) {
		super(token);
		this.tipoDado = tipoDado;
		this.tipoElemento = tipoElemento;
		this.sinal = sinal;
	}

	public TipoDado getTipoDado() {
		return this.tipoDado;
	}

	public TipoElemento getTipoElemento() {
		return this.tipoElemento;
	}

	public String getLexema() {
		StringBuilder operandoCompleto = new StringBuilder();

		// coloca o sinal negativo, se for numero negativo
		if(this.sinal == Sinal.NEG)
			operandoCompleto.append("-");
		
		operandoCompleto.append(super.getLexema());
				
		// se for constante numerica e inteira, coloca uma casa decimal com zero (devido a exigencia do comando assembler ldc2_w)
		if(this.tipoElemento == TipoElemento.CTE && this.tipoDado == TipoDado.NUMERO) {
			double auxDouble = Double.parseDouble(this.token.image);
			int auxInt = Integer.parseInt(this.token.image);
		    if(auxDouble == auxInt)  
		       operandoCompleto.append(".0");
		}
		return operandoCompleto.toString();
	}

	@Override
	public String toString() {
		return this.getLexema() + " (tipo: " + this.tipoElemento 
			 + "/" + this.tipoDado +")";
	}
}
