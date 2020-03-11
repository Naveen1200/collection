package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
			int x = Integer.parseInt(new Scanner(System.in).nextLine());
			String str = x+"";
			//System.out.println(str.length());
			//System.out.println(Math.pow(2, str.length()));
			int copy=x,b=0,c=0;
			//System.out.println(copy%10==0);
			while(copy%10!=0)
			{
				b = copy%10;
				c = (int) (c+Math.pow(b, str.length()));
				copy =copy/10;
				
			}
			System.out.println(c);
		
			}

}
