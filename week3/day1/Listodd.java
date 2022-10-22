package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class Listodd {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(23);
		list.add(54);
		list.add(67);
		list.add(55);
		list.add(66);
		list.add(42);
		list.add(27);
		list.add(89);
		System.out.println(list);
		for(int i=0; i<list.size();i++)
			if(i%2!=0)
			System.out.println("The odd Number is" + i);
	}
		
	}


