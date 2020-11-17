package exe2;

import java.util.Scanner;

public class exe2 {
	public static void main(String args[]) {
		Scanner leia= new Scanner(System.in);
		int senha;
		System.out.println("digite a senha de quatro digitos: ");
		senha=leia.nextInt();
		if(senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.out.println("ACESSO NEGADO");
		}
	}
}
