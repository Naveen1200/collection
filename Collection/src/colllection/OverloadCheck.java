package colllection;

public class OverloadCheck {
	
	public void hello(String s)
	{
		System.out.println("String");
	}
	
	public void hello(Integer s)
	{
		System.out.println("Objects");
	}
	
	
	public static void main(String[] args) {
		
		OverloadCheck x = new OverloadCheck();
		//x.hello(null);
		
	}

}
