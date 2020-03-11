package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicacyRemove {

	public static void main(String[] args) {
		String str1;
		String str2;
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter your String");
		        str1 = in.nextLine();
		        System.out.println("thankyou");
		        DuplicacyRemove d = new DuplicacyRemove();
		        d.removeDup(str1);
		//Integer i = new Integer(str1);
		//System.out.println("Enter Next");
		/*str2 = in.nextLine();
		Integer i2 = new Integer(str2);
		System.out.println(i);
		System.out.println(i2);*/
		
		
	}
	
	public String removeDup(String s)
	{
		String result="", original = s;
		
		String [] str = s.split("");
		HashSet<String> originalSet = new HashSet<>(Arrays.asList(str));
		System.out.println(s.length()+" length");
		System.out.println(originalSet.size()+" size");
		return result;
	}

}
