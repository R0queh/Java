package exe6;

import java.util.Scanner;

public class exe6 {
	public static void main(String args[]) {
		Scanner leia= new Scanner(System.in);
		int chil, totchil=0, x=0, poor=0;
		double sal, bigsal=0,totsal=0, avesal,per,avechil;
		for(x=0;x<20;x++) {
			System.out.println("how much do you earn ? ");
			sal=leia.nextDouble();
			totsal += sal;
			if(sal>bigsal){
				bigsal=sal;
			}
			if(sal<=100.00){
				poor++;
			}
			System.out.println("how many childrens? ");
			chil=leia.nextInt();
			totchil+=chil;
			
		}
		avechil=totchil/20;
		avesal=totsal/20;
		per = (poor*100)/20;
		System.out.println("The average of population salary is: "
				+ avesal + "\nThe average of population childrens is: "
				+ avechil + "\nThe biggest salary of population is: "
				+ bigsal +"\nThe percent of people earning less than 100,00 is: "
				+ per);
	}
}