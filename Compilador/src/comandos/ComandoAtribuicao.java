package comandos;
import semantico.*;
import geradorCodigo.*;
import primitivo.*;
import parser.Token;

public class ComandoAtribuicao extends ComandoAltoNivel {
	public Simbolo variavel;
	public Expressao expressao;
	
	public ComandoAtribuicao(Simbolo simb, Expressao exp, Token token) {
		super(token);
		this.variavel = simb;
		this.expressao = exp;
	}
	
	public String toString() {
		return this.token +"/"+this.variavel.getNome() + "/" + this.expressao.listaExpPosfixa;
	}
	
	 public ComandoPrimitivo geraListaComandosPrimitivos() {
		 String exp = this.expressao.geraCodigoDestino();
		ComandoPrimitivo prim = new PrimitivoAtribuicao(this.variavel.getReferencia(), this.variavel.getTipo(), exp); 
		return prim; //TO-DO
	 }
}
