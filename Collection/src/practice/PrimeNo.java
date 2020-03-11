package practice;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		//String str1;
       // Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        //str1 = in.nextLine();
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        PrimeNo p = new PrimeNo();
        /*boolean b =*/ p.fibonacci(a);
        //System.out.println(b);
        
	}

	
	public boolean prime(int a)
	{
		boolean b = false;
		for (int i =2; i<a ; i++)
		{
			
			if(a%i == 0)
			{
			b = false;
			break;
			}
			else
			{
				b = true;
				
			}
			//System.out.println("i is "+i);
		}
		return b;
	}
	
	public void fibonacci(int a)
	{
		int b=0,c=1,d;
		for(int i=1;i<=a;i++)
		{	
			d = c;
			c =b;
			 b = d+c;
			 System.out.println(b);
			 
		}
	}
}
