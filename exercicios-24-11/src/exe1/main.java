package exe1;

public class main {
	public static void main(String[] args) {
		
	cachorro jaffar = new cachorro("Jaffar", 15);
	cavalo pegasus = new cavalo("Pegasus", 27);
	preguica tandra = new preguica("Tandra", 10);
	
	System.out.println("Nome: " +jaffar.getNome() +" "+ jaffar.somEmitido());
	System.out.println("Nome: " +pegasus.getNome() +" "+pegasus.somEmitido());
	System.out.println("Nome: " +tandra.getNome() +" "+ tandra.somEmitido());
	
	}	
}
