package exercicio1;

import java.util.Scanner;

public class exe1 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, total, media;
					
		System.out.println("Qual o sua nota ?");
		n1 = ler.nextFloat();
		
		System.out.println("Qual o sua nota ?");
		n2 = ler.nextFloat();
		
		System.out.println("Qual o sua nota ?");
		n3 = ler.nextFloat();
		
		total = (n1*2)+(n2*3)+(n3*5);
		media = total/10;
		
		System.out.println("Sua média ponderada é: " + media);
		
	}
}
