package exe1;

import java.util.Scanner;

public class exe1 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int x, resto;
		for (x = 1000; x <= 1999; x++) {
			resto = x % 11;
			if (resto == 5) {
				System.out.println("\n" + x);
			}
		}
	}
}