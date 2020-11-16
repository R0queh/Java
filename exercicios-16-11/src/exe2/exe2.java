package exe2;

import java.util.Scanner;

public class exe2 {
	public static void main(String args[]) {
		String c;
		int n, e = 0, l =0;
		Scanner ler = new Scanner(System.in);
		ler.nextLine();
		System.out.println("Qual seu nome ou código do cartão ?");
		c=ler.nextLine();
		System.out.println("Horas de trabalho: ");
		n=ler.nextInt();
		
		if(n>50) {
			e=n-50;
			l=e*20;
			System.out.println("Olá "+ c +" Seu salário será de : "+((n*10)+l)+"R$, do qual "
					+ l  + "R$ é seu rendimento extra por causa das suas "+ e +
					" Horas trabalhadas extras.");
		}
		else {
			System.out.println("Seu salário será de : "+ (n*10) + "R$ e esse mês "
					+ "você não fez hora extra.");
		}
	}
}
