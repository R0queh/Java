package exe4;

import java.util.Scanner;

public class exe4 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int lados, area; 
		float base, altura, l;
		System.out.println("Quantos lados possui seu poligono: ");
		lados=leia.nextInt();
		
		switch(lados) {
		case 3:
			System.out.println("Qual a base ?");
			base =leia.nextInt();
			System.out.println("Qual a altura ?");
			altura = leia.nextInt();
			System.out.println("A área do seu TRIÂNGULO é: " + ((base*altura)/2));
			break;
		case 4:
			System.out.println("Qual a base ?");
			base =leia.nextInt();
			System.out.println("Qual a altura ?");
			altura = leia.nextInt();
			System.out.println("A área do seu QUADRADO é: " + (base*altura));
			break;
		case 5:
			System.out.println("Qual a base ?");
			base =leia.nextInt();
			System.out.println("Qual a altura ?");
			altura = leia.nextInt();
			System.out.println("A area do seu PENTAGONO é: "+ ((base*5)*altura));
			break;
		case 1:
			System.out.println("NÃO É UM POLIGONO");
			break;
		case 2:
			System.out.println("NÃO É UM POLIGONO");
			break;
		default:
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
			break;
		}
	}	
}