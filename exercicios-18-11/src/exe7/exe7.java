package exe7;

public class exe7 {
	public static void main(String[] args) {
		int x, sum=0;
		for(x=0;x<500;x+=3) {
				if(x%2!=0) {
				sum += x;
				
				}
			}
		System.out.printf("the sum of multiples of 3 between 0 and 500 is: %d",
				sum);
	}
}