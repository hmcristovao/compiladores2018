package exception;

public class SemanticException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
    public SemanticException(String _msg){
      super(_msg);
      this.msg = _msg;
    }
	public String getMessage(){
      return msg;
    }
  }
  