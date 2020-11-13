package exercicio3;

import java.util.Scanner;

public class exe3 {
	public static void main(String args[]) {
		
	float a,b,c,d;
	Scanner ler = new Scanner(System.in);
	
		System.out.println("Valor de a: ");
			a = ler.nextFloat();
	
		System.out.println("Valor de a: ");
			b = ler.nextFloat();
		
		System.out.println("Valor de a: ");
			c = ler.nextFloat();
		d=((a+b)*(a+b))+((b*c)+(b*c))/2;
		System.out.println("Valor de 'd' é : " + d);

	}
}
