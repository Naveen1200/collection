package java8;

public class MathOpTest {

	public static void main(String[] args) {

		MathOpTest x = new MathOpTest();
		MathOperations add = (a,b) -> System.out.println("Addition is "+(a+b));
		MathOperations sub = (a,b) -> System.out.println("Sub is "+(a-b));
		MathOperations mul = (a,b) -> System.out.println("Multiplication is "+(a*b));
		MathOperations div = (a,b) -> System.out.println("Division is "+(a/b));
		add.operation(10, 20);
		x.opration(30, 20, sub);
	}
	
	
	private void opration (int a, int b, MathOperations mathOperations)
	{
		mathOperations.operation(a, b);
	}

}
