package exe8;

import java.util.Scanner;

public class exe8 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int tot=0, sum = 0, ave, num = 0;
		while (num >= 0) {
			System.out.println("say a number: ");	
			num = leia.nextInt();
			if(num>0) {				
			sum += num;
			tot++;
			}
		}
		ave = sum / tot;
		System.out.printf("The sum of this numbers is: %d " + "\nThe average of this numbers is: %d "
				+ "\nthe total numbers read: %d", sum, ave, tot);
	}
}
