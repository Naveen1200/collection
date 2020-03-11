package dto;

public abstract class OoopsParant {
	// for mathod over loading
	
	public void m1(int a)
	{
		System.out.println(" a is "+a);
	}
	
	public abstract void m2(String s);
	
	public void m1(String a)
	{
		System.out.println(" a is "+a);
	}
	public static void main(String[] args) {
/*	
			OoopsParant s = new OoopsParant();
			s.m1(5);
			s.m1("hello ");*/
	}

}
