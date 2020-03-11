package practice;

import java.util.Scanner;

public class HCF {
	
	public static void main(String[] args) {
		System.out.println(" enter fiirst no");
		int i = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("enter 2nd no");
		int i1 = Integer.parseInt(new Scanner(System.in).nextLine());
		
		int min = Math.min(i, i1);
		int x =0;
		for(int j =2; j<min; j++)
		{
			if((i%j==0)&&(i1%j==0))
			{
				//System.out.println(" HCF is "+j);
				x = j;
			}
		}
		System.out.println(" HCF is "+x);
	}

}
