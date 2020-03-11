package java8;

public class Tester1 implements Interf2,Intref1 {

	/*@Override
	public void hello() {
		System.out.println(" in  side class ");
	}
	*/
	public static void main(String[] args) {
		Tester1 t = new Tester1();
		t.hello();
		//Intref1.hello();
		Interf2.hello();
	}

}
