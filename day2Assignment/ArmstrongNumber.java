package week1.day2Assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num1 = 153;
		int num2 = 0;
		int num3 = 0;
		int num4 = num1;
		
		while(num1>0)
		{
	num3 = num1%10;
	num1 = num1/10;
	num2 = num2+num3*num3*num3;
		}
		if (num4==num2) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not an Armstrong Number");
		}
		}

