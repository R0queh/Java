import java.util.Scanner;

public class POO {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int[] val=new int[10];
		int  tot=0, x, sum=0, ave, bigger=0;
		for(x=0;x<10;x++) {
			System.out.println("what is the value given in the die ? ");
			val[x]=leia.nextInt();
			sum = sum+val[x];
			if(val[x]>6 || val[x]< 1) {
				System.out.println("Invalid number");
				break;
			}
			if(val[x]>bigger) {
				bigger=val[x];
				tot = 0;
				}
			if(val[x] == bigger) {
				tot++;
			}
		}
		for(x=0;x<10;x++) {
			System.out.println(val[x]);
		}
		ave=sum/10;
		System.out.printf("the average of this dies numbers is : %d \nThe largest number presented was: %d "
				+ "\nAnd this number was presented %d times",ave,bigger,tot);
	}
}
