package semantico;
import parser.Token;

public class Operando extends Item {

	public TipoDado tipoDado;
	public TipoElemento tipoElemento;
	public String valor;
	
	public Operando(Token t,TipoDado tipoDado, String valor) {super(t); this.tipoDado=tipoDado;this.valor=valor;}
	public Operando(Token t,TipoElemento tipoElemento, String valor) {super(t); this.tipoElemento=tipoElemento;this.valor=valor;}
	public TipoDado getTipoDado() {
		return this.tipoDado;
	}
	public TipoElemento getTipoElemento() {
		return this.tipoElemento;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
