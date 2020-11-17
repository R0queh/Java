package exe3;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qnt;
		System.out.println("quants maças desejas ? ");
		qnt=leia.nextInt();
		if(qnt<12) {
			System.out.println("o valor da compra é: "+ (qnt*0.30) +" R$");
		}else {
			System.out.println("o valor da compra é: "+ ((11*0.30)+(qnt-11)*0.25)
					+ " R$");
		}
	}
}
