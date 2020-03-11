package coll;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {

		HashSet h1 = new HashSet<>();
		h1.add(1);
		h1.add("1");
		h1.add(8);
		h1.add("hii");
		h1.add("hello");
		h1.add(9);
		h1.add('c');
		h1.add("asd");
		System.out.println(h1);
		
		LinkedHashSet h2 = new LinkedHashSet(h1);
		//h2 =  h1;
		System.out.println(h2);
		
	}

}
