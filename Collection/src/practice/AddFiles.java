package practice;

import java.util.ArrayList;

public class AddFiles {
	
	public String assStringNo(String s,String s1)
	{
		String s2 = "";
		String copys1="";
		String copys2 = "";
		if(s.length() >= s1.length())
		{
			copys1 = new StringBuffer(s).reverse().toString()+"0";
			copys2 = new StringBuffer(s1).reverse().toString()+"0";
			
		}
		else
		{
			copys1 = new StringBuffer(s1).reverse().toString()+"0";
			copys2 = new StringBuffer(s).reverse().toString()+"0";
		}
		s2 = copys1.substring(0,copys2.length());
		System.out.println(copys1);
		System.out.println(copys2);
		System.out.println(s2);
		int sum,carry =0;
		String add ="";
		for(int i=0;i<s2.length();i++)
		{
			sum = (int)(copys2.charAt(i)-'0')+(int)(s2.charAt(i)-'0')+carry;
			add =add+(sum%10);
			carry = sum/10;
		}
		System.out.println(add);
		s1 = new StringBuffer(copys1.substring(s2.length())).reverse().toString()+(new StringBuffer(add).reverse().toString());
		System.out.println(s1);
		return s1;
	}
public static void main(String[] args) {
	String s = "99999999999999999";
	String s1 ="";
	ArrayList<String> al1 ;
	ArrayList<String> al2;
	//al = Arrays.
	
	}
}
