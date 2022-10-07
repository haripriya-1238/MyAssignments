package week1.day2Assignment;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int Length = arr.length;
		int count;
		for(count = 0; count < Length-1; count++)
		for(int i = count+1; i < Length; i++)
			if(arr[count]==arr[i]) {
			System.out.println("The Duplicate Array is " + arr[count]);
		
	}
	

}}
