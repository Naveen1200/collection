package core;

public class PrimeArray {

	public static void main(String[] args) {
		
		PrimeArray pa = new PrimeArray();
		pa.fun(20);

	}

	public void fun(int size) {
		int x = 2, z=1, i = 1, j;
		Integer[] p = new Integer[size];
		p[0] = 1;
		outer: while (i < size) {
			boolean flag = true;
			j =1;
			inner: while (j <=z/2) {
				//System.out.println(" i side inner x is"+x);
				if (x % p[j] == 0) {
					
					flag = false;
					break inner;
				}
				j++;

			}
			if (flag) {
				p[z] = x;
				z++;
				i++;
			}

			x++;
			
			
			
			//System.out.println("x:"+x+" i:"+i);

		}
		//System.out.println(p[5]+" "+p[4]+" "+p[3]);
		/*for(int a:p)
		{
			System.out.println(a);
		}*/
	}

}
