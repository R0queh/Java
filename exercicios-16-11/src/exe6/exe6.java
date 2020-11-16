package exe6;

import java.util.Scanner;

public class exe6 {
	public static void main(String args[]) {
		Scanner ler=new Scanner(System.in);		
		int idade; 
		System.out.println("Qual sua idade ?");
		idade=ler.nextInt();
		if(idade >= 5 && idade <= 7 ) {
			System.out.println("Sua categoria é : infantil A");
		}else if(idade>=8 && idade <= 11) {
			System.out.println("Sua categoria é : infantil B");
		}else if(idade>=12 && idade<=13) {
			System.out.println("Sua categoria é : juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Sua categoria é : infantil B");
		}else if(idade >= 18) {
			System.out.println("Sua categoria é : Adulto");
		}else if(idade < 5 && idade > 0){
			System.out.println("idade fora de categoria.");
		}else {
			System.out.println("idade invalida.");
		}
	}
}