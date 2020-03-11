package check;

import java.util.Arrays;

public class Anagram {
	
	public boolean anagramCheck(String str1, String str2)
	{
		char [] ary1 = str1.toCharArray();
		char [] ary2 = str2.toCharArray();
		
		Arrays.sort(ary1);
		Arrays.sort(ary2);
		
		System.out.println(ary1);
		System.out.println(ary2);
		
		if(ary1.length != ary2.length)
			return false;
		
		for(int i=0; i<ary1.length; i++)
		{
			if(ary1[i] != ary2[i])
				return false;
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Anagram a = new  Anagram();
		System.out.println(a.anagramCheck("hello", "lohel"));
	}

}
