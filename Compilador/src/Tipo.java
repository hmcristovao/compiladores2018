public enum Tipo {
	NUMERO("numero"),
	PALAVRA("palavra"); 
	
	private String nome;
	Tipo(String nome){
		this.nome= nome;
	}
	
	public String getNome() {
		return nome;
	}
}