package exception;
class Sub extends Super
{
	public void fun() throws NullPointerException
	{
		System.out.println(" Sub ");
	}
	
	public static void main(String[] args) {
		Super s1 = new Super();
		Super s2 = new Sub();
		Sub s3 = new Sub();
		s1.fun();
		s2.fun();
		s3.fun();
	}


}
