package week1.day2Assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 123895;
		int sum = 0;
		int reminder;
		while(input>0)
		{
		    reminder = input%10;
		    System.out.println(reminder);
			sum = sum + reminder;
			System.out.println(sum);
			input = input / 10;
			System.out.println(input);
			}
		System.out.println("Sum of digits " + sum);
		
	}
	
}
