package exe2;

import java.util.Scanner;

public class exe2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int x, num, par = 0, impar = 0;
		for (x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.printf("Pares: %d \nImpares: %d", par, impar);
	}
}
