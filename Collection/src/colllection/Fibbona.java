package colllection;

public class Fibbona {
	
	
	int result = 0, a=0, b=0;
	static int i = 0, incr=0;
	public int fibRec(int x)
	{	System.out.println(" hello i is "+i+ " and x is "+x);
	
	if(i==0)
	{
	incr = x;	
	}
	i++;
		if(i<incr)
		{
			
			System.out.println("i:"+i+" res:"+result);
			
			if(i == 1)
			{
				result = 1;
				a =b;
				b = result;
			}
			result = a+b;
			
			a =b;
			b = result;
			
			fibRec(i);
		}
		
		return result;
	}
	
	int fun2(int a, int b) 
	{ 
	    if (b == 0) return 1; 
	    return fun(a, fun2(a, b-1)); 
	} 
	
	int fun(int x, int y) 
	{ 
	    if (y == 0)   return 0; 
	    return (x + fun(x, y-1)); 
	} 
public static void main(String[] args) {
	
	/*Fibbona f = new Fibbona();
	System.out.println(f.fibRec(10)+" ....");*/
	//System.out.println(2%3);
	Fibbona f = new Fibbona();
	System.out.println(f.fun2(2, 3));
	
}
}
