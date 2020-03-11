package check;

public class X {

	public static void main(String[] args) {
		X x = new X();
		X x2  = m1(x);
		X x4 = new X();
		x2 = x4;
		doComplexStuff();
		
		
	}
	
	private static void doComplexStuff() {
		// TODO Auto-generated method stub
		
	}

	static X m1(X mx)
	{
		mx = new X();
		return mx;
	}
	

}
