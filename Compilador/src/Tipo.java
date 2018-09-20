public enum Tipo {
	NUMERO("numero"),
	PALAVRA("palavra"),
	OPERANDO("operando"),
	STRING("string"),
	VARIAVEL("variavel");
	
	private String nome;
	Tipo(String nome){
		this.nome= nome;
	}
	
	public String getNome() {
		return nome;
	}
}