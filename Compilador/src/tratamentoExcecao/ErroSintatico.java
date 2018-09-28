package tratamentoExcecao;

public class ErroSintatico extends RuntimeException {
	public ErroSintatico(String msgErro) 
	{
		super(msgErro);
	}
}
