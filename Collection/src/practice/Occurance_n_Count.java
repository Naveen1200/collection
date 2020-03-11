package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Occurance_n_Count {

	public static void main(String[] args) {
		System.out.println(" enter input ");
		String str = new Scanner(System.in).nextLine();
		ArrayList<String> al = new ArrayList<>(Arrays.asList(str.split(",")));
		System.out.println(" main list size:"+al.size());
		ArrayList<String> copy = new ArrayList<>();
		ArrayList<Integer> occurance = new ArrayList<>();
		Iterator<String> itr = al.iterator();
		int i = 0;
		int count = 1;
		while (itr.hasNext()) {
			//System.out.println(" val of i "+i);
			String s = itr.next();
			if (i > 0) {
				
				//System.out.println(" val of list is "+al.get(i-1));
				if (al.get(i-1).equals(s)) {
					//System.out.println(" s is "+s);
					count++;
					copy.add(s);
				} else {
					System.out.println(" no is  "+al.get(i-1)+" occrance is: "+count);
					occurance.add(count);
					count = 1;
					copy.add(s);
				}

			} else {
				copy.add(s);
			}
			
			i++;
			
		}
		//System.out.println("copy size is:"+copy.size()+"..."+occurance.size());
		System.out.println(" no is  "+al.get(i-1)+" occrance is: "+count);
		


	}

}
