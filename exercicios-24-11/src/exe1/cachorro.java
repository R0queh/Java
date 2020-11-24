package exe1;

public class cachorro extends animal {
	
	public cachorro(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	
	public String oQueFaz() {
		return "ele corre !";
	}
	public String somEmitido() {
		return "Au Au";
	}
}