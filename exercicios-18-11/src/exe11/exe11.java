package exe11;

import java.util.Scanner;

public class exe11 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, sum=0;
		System.out.println("enter a number: ");
		num=leia.nextInt();
		do {
			sum += num;
			num--;
		}while(num !=0);
		System.out.printf("The factorial sum is: %d", sum);
		
	}
}