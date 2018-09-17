package classesExtras;

public class SemanticException extends RuntimeException {
	public SemanticException(String t){
		super("\nErro semântico\nA variável \'" + t + "\' não foi inicializada");
	}
}
