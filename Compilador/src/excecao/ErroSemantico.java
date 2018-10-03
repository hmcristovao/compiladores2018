package excecao;

public class ErroSemantico extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
    public ErroSemantico(String msg){
      super(msg);
      this.msg = msg;
    }
	public String getMessage(){
      return msg;
    }
  }
  