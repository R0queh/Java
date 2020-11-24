import java.util.Scanner;

public class teste {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int segundos,hora, minutos, segundo;
		System.out.println("Quantos segundos de duração ? ");
		segundos = ler.nextInt();
		hora = (segundos/60)/60;
		minutos = (segundos-(hora*60*60))/60;
		segundo = (segundos-((hora*60*60)+(minutos*60)));
		System.out.println("durará "+ hora + " horas, " + minutos + " minutos, " + segundo + 
				" Segundos.");
}
}