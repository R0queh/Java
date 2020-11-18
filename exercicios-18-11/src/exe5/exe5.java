package exe5;

import java.util.Scanner;

public class exe5 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int num,div=0,total, res=0;
		do {
			System.out.println("Say a number: ");
			num=leia.nextInt();
			if(num % 3 == 0 && num!=0) {
				div++;
				res += num;
			}
			
		}while(num !=0);
		total=res/div;
		System.out.printf("the average of multiples of 3 is: %d",total);
	}
}
