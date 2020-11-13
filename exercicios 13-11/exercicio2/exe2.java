package exercicio2;

import java.util.Scanner;

public class exe2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float valorFabrica; 
		double valorTotal;
		
		System.out.println("Qual o valor do carro ?");
		valorFabrica = ler.nextFloat();
		valorTotal=valorFabrica*1.73;
		System.out.println("o seu carro custara: " + valorTotal);
	}
}
