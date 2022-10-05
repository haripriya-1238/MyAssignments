package week1.day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String args[])
{
	int[] data = {3,2,11,4,6,7};
	int length = data.length;
	Arrays.sort(data);
	for (int i=0; i<length; i++)
	System.out.println(data[i]);
	System.out.println(data[3]);
	
}
}
