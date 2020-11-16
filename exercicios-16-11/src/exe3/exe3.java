package exe3;

import java.util.Scanner;

public class exe3 {
	public static void main(String args[]) {
		int a, b, c, d, a2, b2, c2, d2;
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		a=ler.nextInt();
		System.out.println("Segundo número: ");
		b=ler.nextInt();
		System.out.println("Terceiro número: ");
		c=ler.nextInt();
		System.out.println("Quarto número: ");
		d=ler.nextInt();
		
		a2=a*a;
		b2=b*b;
		c2=c*c;
		d2=d*d;
		
		if(c2>1000){
			System.out.println("o quadrado de " + c + " é: " + c2 +".");
		}else {
			System.out.println("o quadrado de " + a + " é: " + a2 +".");
			System.out.println("o quadrado de " + b + " é: " + b2 +".");
			System.out.println("o quadrado de " + c + " é: " + c2 +".");
			System.out.println("o quadrado de " + d + " é: " + d2 +".");
		}
				
		
	}
}
