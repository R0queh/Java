package exercicio6;

import java.util.Scanner;

public class exe6 {
	public static void main(String args[]) {
		int dias, anos, meses, res;
		Scanner ler = new Scanner(System.in);
		System.out.println("você ja viveu quantos dias ? ");
		res = ler.nextInt();
		anos = res/365;
		meses = (res- (anos*365))/30;
		dias = res-(anos*365+meses*30);
		System.out.println("Então você tem: "+ anos + " anos, " + meses + " meses, " + dias
				+ " dias.");
	}

}
