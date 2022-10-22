package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		// input
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// Create a empty Set Using TreeSet
		Set<Integer> empty = new TreeSet<Integer>();
		// Declare for loop iterator from 0 to data.length and add into Set
		for (int i = 0; i < data.length; i++) {
			empty.add(data[i]);
		}
		System.out.println(empty);
		List<Integer> num = new ArrayList<Integer>(empty);
		// Print the second last element from List
		System.out.println("The Second Largest Number is " + num.get(num.size() - 2));
	}
}
