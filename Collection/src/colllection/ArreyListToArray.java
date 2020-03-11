package colllection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyListToArray {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("xyz1");
		al.add("xyz2");
		al.add("xyz3");
		al.add("xyz4");
		al.add("xyz5");
		al.add("xyz6");
		al.add("xyz7");
		al.add("xyz8");
		al.add("xyz9");
		al.add("xyz10");
		al.add("xyz11");
		al.add("xyz12");
		al.add("xyz13");
		System.out.println("al is "+al);
		int i = al.size();
		
		String [] ar = new String[i];
		
		Iterator itr = al.iterator();
		
		int k =0;
		while(itr.hasNext())
		{
			System.out.println("k is "+k);
			ar[k]=(String) itr.next();
			k++;
			//System.out.println(" k is "+k+ " bool is "+itr.hasNext()+"  ... "+(String) itr.next());
		}
		
		System.out.println("array "+ ar.length);
		
		for(int l=0;l<ar.length;l++)
		{
			System.out.println(" ............................");
			System.out.println(ar[l]);
		}
	}
	
	

}
