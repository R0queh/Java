package exe5;

import java.util.Scanner;


public class exe5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double poluicao;
		
		System.out.println("Qual o indicie de poluição atual ? ");
		poluicao= ler.nextDouble();
		if(poluicao <= 0.25) {
			System.out.println("Ta Tranquilo ta favorável.");
		}else if(poluicao>0.25 && poluicao < 0.4) {
			System.out.println("teremos que parar com a produção das "
					+ "empresas do grupo 1, ou seja as empresas que mais poluem.");
		}else if(poluicao>=0.4 && poluicao < 0.5) {
			System.out.println("teremos que parar com a produção das "
					+ "empresas do grupo 1 e do grupo 2, ou seja as empresas que "
					+ "médio a muito poluem.");
		}else {
			System.out.println("Moioooooooo, corre que o bicho ta pegando "
					+ "fecha tuuuuuudo.");
		}
}
}