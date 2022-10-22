package week3.day2;

public class MissingNumber {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num1 = 1;
		for (int i = 0; i <= num.length - 1; i++)
			if (num[i] != 0)
				System.out.println(i + num1);
		num1++;

	}

}
//Remove the duplicates using Set
//Make sure the set is in the ascending order
//Iterate from the starting number and verify the next number is + 1
//If did not match, that is the number