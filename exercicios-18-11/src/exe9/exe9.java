package exe9;

import java.util.Scanner;

public class exe9 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num = leia.nextInt();
		while (num < 100) {
			num *= 3;
			System.out.println("\n" + num);
		}
	}
}