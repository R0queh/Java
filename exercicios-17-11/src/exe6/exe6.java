package exe6;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c, maior=0;
		System.out.println("digite um valor: ");
		a=leia.nextInt();
		System.out.println("digite um valor: ");
		b=leia.nextInt();
		System.out.println("digite um valor: ");
		c=leia.nextInt();
		if(a>maior) {
			maior=a;
		}
		if(b>maior) {
			maior=b;
		}
		if(c>maior) {
			maior=c;
		}
		System.out.println("o maior numero é: " + maior);
	}
}
