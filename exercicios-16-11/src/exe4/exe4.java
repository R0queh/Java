package exe4;

import java.util.Scanner;

public class exe4 {
	public static void main(String args[]) {
		Scanner ler=new Scanner(System.in);
		
		int a;
		System.out.println("me diga um número: ");
		a=ler.nextInt();
		
		if(a>0) {
			if(a%2==0) {
				System.out.println("Seu número é positivo e par");
			}else {
				System.out.println("Seu número é positivo e impar");
			}
		}else {
				if(a%2==0) {
					System.out.println("Seu número é negativo e par");
				}else {
					System.out.println("Seu número é negativo e impar");
			}
		}
	}
}
