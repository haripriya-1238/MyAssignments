package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 13;
		boolean type = false;
		for(int i=2; i<num/2; ++i) {
			if (num%i==0) {
				type = true;
		break;}
		}
	
	if (!type) 
		System.out.println("It's a Prime Number");
		else
			System.out.println("Not a Prime Number");
	}


}