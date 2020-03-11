package java8;
interface Greetings
{

	String sayHello(String name);

}
public class TesterJ8 {
	final static String var = "Hello ! ";
	public static void main(String[] args) {
		Greetings greet = message -> var+message;
		
		System.out.println(greet.sayHello("Naveen"));
		
		
		
		
	}

}
