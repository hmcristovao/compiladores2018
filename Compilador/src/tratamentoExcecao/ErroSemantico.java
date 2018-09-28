package tratamentoExcecao;

public class ErroSemantico extends RuntimeException {
	public ErroSemantico(String erro)
	{
		super(erro);
	}
}
