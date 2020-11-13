package exercicio5;

import java.util.Scanner;

public class exe5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total;
		System.out.println("Quantos anos você tem ? "+
		"\nEm anos:");
		anos = ler.nextInt();
		System.out.println("Em meses: ");
		meses = ler.nextInt();
		System.out.println("Em dias: ");
		dias = ler.nextInt();
		
		total = (anos*365)+(meses*30)+dias;
		
		System.out.println("Você já viveu " + total + " dias.");
	}

}
