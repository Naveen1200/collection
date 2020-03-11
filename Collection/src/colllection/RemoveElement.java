package colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		byte b = 127;
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		al.add("a");
		al.toArray().getClass().getName();
		//String [] s = (String[]) al.toArray();
		System.out.println(Arrays.toString(al.toArray()).length());
		//System.out.println(s.getClass().getName());
		
	
	}

}
