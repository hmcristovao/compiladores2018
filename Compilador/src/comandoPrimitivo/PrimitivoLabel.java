package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo {
	String label;
	static int contador = 0;
	
	public PrimitivoLabel(String label) {
		this.label = label+"_"+contador; //cria um nome novo para a label, levando em consideração o contador
		contador++; //toda vez que cria uma nova label incrementa o marcador
	}
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		return this.label+":"; //adiciona os dois pontos indicando o inicio da label
	}

	public String toString() {
		return "label " +this.label+ " contador "+contador;
	}
}
