package exception;

public class SemanticException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
    public SemanticException(String msg){
      super(msg);
      this.msg = msg;
    }
	public String getMessage(){
      return msg;
    }
  }
  