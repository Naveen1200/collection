package colllection;

import java.util.*;



public class TestCopy {
	
	public static void main(String[] args) {
		int[] are = {1,2,3,4,5,6,1,5,6,7,77,7,8,2,1,8,9,9,98,65};
		System.out.println(are.length);
		List l = (List) Arrays.asList(are);
		System.out.println(l.size());
		//List<Integer> arrList = Arrays.asList(are);
		HashSet<Integer> s = new HashSet<>();
		//s.addAll(arrList);
		 
		System.out.println(s.size());
	}

}
