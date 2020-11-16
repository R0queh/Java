package exe8;

import java.util.Scanner;

public class exe8 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a;
		System.out.println("número: ");
		a=ler.nextInt();
		if(a>100) {
			System.out.println(a);
		}else {
			System.out.println(0);
		}
		
	}
}
