package exe1;

import java.util.Scanner;

public class exe1 {
	public static void main(String args[]) {
		int p, e=0; 
		double m=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("quantos quilos de tomate transportados ?");
		p= ler.nextInt();
		if(p>50) {
			e=p-50;
			m=e*4;
			System.out.printf("Você trouxe "+p+" quilos de tomate,e por isso "
					+ "excedeu "+ e +" quilos na lei de transporte de tomates."
							+ "\nPor isso pagará "+ m +"R$ de multa.");
		}else {
			System.out.printf("ta safe, só vender seus tomates na paz.");
		}
	}
}