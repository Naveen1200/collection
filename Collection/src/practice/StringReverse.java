package practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		/*	String s = "Naveen";
			StringReverse sr = new StringReverse();
			String s3 = "";
			s3 = sr.reverse(s);
			System.out.println(s3+ "  "+s3.length());*/
			String str1;
			String str2;
			
			        Scanner in = new Scanner(System.in);
			
			        System.out.println("Enter your String");
			
			        str1 = in.nextLine();
			        
			        
			Integer i = new Integer(str1);
			System.out.println("Enter Next");
			str2 = in.nextLine();
			Integer i2 = new Integer(str2);
			System.out.println(i);
			System.out.println(i2);
			
			
			
			
	}
	
	public String reverse(String s)
	{
		String str = s;
		int s1 = str.length() - 1;
		String s2 = "";
		for(int i=s1 ; i>=0 ; i--)
		{
			//System.out.print(str.charAt(i));
			s2 = s2+str.charAt(i);
		}
		System.out.println("..");
		return s2;
	}

}
