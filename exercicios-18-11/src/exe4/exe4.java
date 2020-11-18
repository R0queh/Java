package exe4;

import java.util.Scanner;

public class exe4 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int num, res=0;
		System.out.println("say a number: ");
		num = leia.nextInt();
		do {
			res += num;
			num--;
			
		}while(num != 0);
		System.out.printf("the total amount is: %d", res);
	}
}