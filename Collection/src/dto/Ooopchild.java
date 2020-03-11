package dto;

public class Ooopchild  extends OoopsParant{
	
	@Override
	public void m2(String s) {
		System.out.println(" this is abstract method "+s);
		
	}
	
	public void m1(int a)
	{
		System.out.println(" child a "+a);
	}

	
	public void m1(String a)
	{
		System.out.println(" child a string "+a);
	}
	public static void main(String[] args) {
		OoopsParant c = new Ooopchild();
		//OoopsParant p = new OoopsParant();
		Ooopchild c1  = new Ooopchild();
		c.m1(5);
		c.m1("Hello child");
		
		c.m1(15);
		c.m1("Hello child one");
		
		/*p.m1(10);
		p.m1("parent ");*/
		
		
		

	}


	

}
