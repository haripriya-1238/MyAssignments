package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		// get the length of the array
		System.out.println("Length of the list is " + list.size());
		// sort the array
		Collections.sort(list);
		System.out.println("The Sorting list is " + list);
		// Iterate it in the reverse order
		for (int i = list.size() - 1; i >= 0; i--) {
			// print the array
			System.out.println("The final output is " + list.get(i));
		}

	}
}
