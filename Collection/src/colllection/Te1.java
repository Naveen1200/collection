package colllection;

import java.util.Arrays;

public class Te1 {
	
	public static void main(String[] args) {
		Te1 t = new Te1();
		System.out.println(t.isAna("navaen", "eenavn"));
		
	}
	
	public boolean isAna(String str1 , String str2)
	{
		char[] ary1 = str1.toCharArray();
		char[] ary2 = str2.toCharArray();
		Arrays.sort(ary1);
		Arrays.sort(ary2);
		if(ary1.length != ary2.length)
			return false;
		
		for(int i=0; i<ary1.length; i++)
			if(ary1[i] != ary2[i])
					return false;
		
		
		return true;
	}
	 

	
}
