package telusko;

import java.util.Arrays;
import java.util.List;

public class Java_8_1 {

	public static void main(String[] args) {
		String a [] =  {"a","h","g","f","e","d","c","b"};
		Integer in [] = new Integer [] {1,2,3,4,5,6,9,8,7};
		List<Integer> l = Arrays.asList(in);
		
		/*for(int i=0; i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		
		/*for(int i :l)
		{
			System.out.println(i);
		}*/
		
		l.forEach(i-> System.out.println(i));

	}

}
