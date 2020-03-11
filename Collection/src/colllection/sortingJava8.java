package colllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortingJava8 {
	
	public static void main(String[] args) {
		ArrayList<String> first = new ArrayList<>();
		first.add("naveen");
		first.add("naresh");
		first.add("navneet");
		first.add("kalyan");
		first.add("manish");
		first.add("chetan");
		first.add("tanmay");
		first.add("vivan");
		first.add("vishal");
		first.add("chankey");
		first.add("Aaditya");
		first.add("jayesh");
		first.add("mayank");
		
		sortingJava8 a = new sortingJava8();
		a.sort1(first);
		System.out.println(first);
		
	}
	
	
	public void sort1(ArrayList<String> s)
	{
		Collections.sort(s, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
	}
	
		

}
