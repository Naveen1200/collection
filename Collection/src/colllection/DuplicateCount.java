package colllection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCount {
	
	public static void main(String[] args) {
		DuplicateCount a = new DuplicateCount();
		a.duplicateCount("jbfi;uwNFFKLWDIHKWDKJBILHFV;NELIUHW;JLIHWGIRH;ONKWVUEIHEINGIUEIEVINENVIEUGHERIU");
	}
	
	public void duplicateWordCount(String s)
	{
		
	}
	
	public void duplicateCount(String s)
	{
		int i = 0;
		System.out.println(s.length());
		Map<Character,Integer> map = new HashMap<>();
		while(i<s.length())
		{
			if(map.containsKey(s.charAt(i)))
			{
				//map.
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
			
			
			
			i++;
		}
		
		//System.out.println();
		System.out.println(map.size());
		for (Entry<Character, Integer> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	
	}

}
