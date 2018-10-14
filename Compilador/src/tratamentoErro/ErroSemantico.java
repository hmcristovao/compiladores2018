/**
 * 
 */
package tratamentoErro;

/**
 * @author henrique
 *
 */
public class ErroSemantico extends RuntimeException {
	public ErroSemantico(String erro)
	{
		super(erro);
	}
}

