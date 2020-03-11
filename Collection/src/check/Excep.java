package check;
class Ex0 extends Exception{}
class Ex1 extends Ex0{
	
}
public class Excep {

	public static void main(String[] args) {
		try{
			//throw new Ex0();
			System.out.println("hello...."+1/0);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Exception");
		}
		/*catch(Ex1 e1)
		{
			System.out.println("ex1");
		}
		catch(Ex0 e1)
		{
			System.out.println("ex0");
		}
		
		catch(Exception e)
		{
			System.out.println("exception");
		}*/
		
	}

}
