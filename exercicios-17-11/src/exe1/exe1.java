package exe1;

import java.util.Scanner;

public class exe1 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o primeiro numero: ");
		a=leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		b=leia.nextInt();
		if(a>b) {
			System.out.println("O maior número é: " + a);
		}else {
			System.out.println("o maior número é: " + b);
		}
	}
}
