package practice;

import java.util.Arrays;

public class ArrayInOrder {
	
	public int [] accendingOrder(int [] x)
	{
		int i=0;
		while(i<x.length)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int a = x[j];
					int b = x[i];
					/*a = a+b;
					b = a-b;
					a= a-b;*/
					x[j] = b;
					x[i] = a;
				}
			}
			i++;
		}
		return x;
	}
	
	public String arrengeString(String str)
	{
		String [] s = str.split(" ");
		int i = 0;
		while (i<s.length){
			for(int j =i+1; j<s.length ; j++)
			{
				if(s[i].length() > s[j].length())
				{
					String temp = s[i];
					String temp1 = s[j];
					s[i] = temp1;
					s[j] = temp;
				}
			}
			i++;
		}
		str = Arrays.toString(s);
		//System.out.println(str.length());
		return str;
	}
	public static void main(String[] args) {
		/*int [] x = {1,2,5,22,6,22,60,80,60,35,25};
		int [] y = new ArrayInOrder().accendingOrder(x); 
		for(int z : y)
		{
			System.out.println(z);
		}*/
		String str = "1 22 333 5555 999999999 55555 4444 1 22 66666";
		System.out.println(str.length());
		System.out.println(" String "+ new ArrayInOrder().arrengeString(str));
	}

}
