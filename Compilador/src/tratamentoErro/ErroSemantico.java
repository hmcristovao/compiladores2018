package tratamentoErro;

public class ErroSemantico extends RuntimeException {
	public ErroSemantico(String erro)
	{
		super(erro);
	}
}
