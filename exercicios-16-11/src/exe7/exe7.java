package exe7;

import java.util.Scanner;

public class exe7 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double base,altura,area;
		System.out.println("Qual a base do triângulo: ");
		base = ler.nextDouble();
		System.out.println("qual altura do triângulo: ");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("a área do triangulo é igual a : " + area);
		
}
}