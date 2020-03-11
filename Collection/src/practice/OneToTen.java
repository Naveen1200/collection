package practice;

public class OneToTen {
	
	public void recursiveMethod (int n)
	{	
	if(n<=10){
		System.out.println(n);
		recursiveMethod(n+1);
	}
	}
	

	public static void main(String[] args) {
		OneToTen x = new OneToTen();
		x.recursiveMethod(0);
	}

}
