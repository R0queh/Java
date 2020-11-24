package exe1;

public class cavalo extends animal {

	public cavalo(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public String oQueFaz() {
		return "ele corre !";
	}	
	public String somEmitido() {
		return "IIIIIIIIIIIIIrrririririririri";
}
}