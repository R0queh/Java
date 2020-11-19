package exe2;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int line=2, colun=2, i, x;
		int[][] n1=new int [line][colun], n2=new int [line][colun], m1= new int [line][colun], m2=new int [line][colun];
		for(i=0; i<line; i++) {
			for(x=0;x<colun;x++) {
				System.out.println("enter with a number to n1["+(i+1)+"] ["+(x+1)+"]");
				n1[i][x]=leia.nextInt();
			}
		}
		for(i=0; i<line; i++) {
			for(x=0;x<colun;x++) {
				System.out.println("enter with a number to n2["+(i+1)+"] ["+(x+1)+"]");
				n2[i][x]=leia.nextInt();
				m1[i][x]=n1[i][x]+n2[i][x];
				m2[i][x]=n1[i][x]-n2[i][x];
			}
		}
		System.out.println("M1: \n");
		for(i=0; i<line; i++) {
			for(x=0;x<colun;x++) {
				System.out.printf("[%d]",m1[i][x]);
			}
			System.out.println();
		}
		System.out.println("M2: \n");
		for(i=0; i<line; i++) {
			for(x=0;x<colun;x++) {
				System.out.printf("[%d]",m2[i][x]);
			}
			System.out.println();
		}
	}
}
