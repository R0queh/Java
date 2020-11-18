package exe3;

import java.util.Scanner;

public class exe3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;
		while (idade != -99) {
			System.out.println("qual a idade ? ");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0) {
				menor++;
			} else if (idade > 50) {
				maior++;
			} else {
				continue;
			}
		}
		System.out.printf("temos %d pessoas menores de 21 \nTemos %d pessoas maiores de " + "50 anos", menor, maior);
	}

}
