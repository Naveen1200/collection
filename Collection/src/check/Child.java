package check;
class Parent {
	public void method(int i)
	{
		System.out.println("vlaue of i..."+i);
	}

}

public class Child {
	
	public void method(int i)
	{
		System.out.println("vlaue of i..."+i);
	}
	public void method(String i)
	{
		System.out.println("vlaue of i passed..."+i);
	}

	public static void main(String[] args) {
		Parent b1 = new Parent();
		Parent b2 = new Parent();
		Child c = new Child();
		b1.method(5);
		c.method("6");
		

	}

}
