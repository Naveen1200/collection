package practice;


public class T1 {
	
	public String do1()
	{
		try{
			throw new RuntimeException( "hello");
			//return "try";
		}
		catch(Exception e)
		{
			return"catch";
		}
		finally{
			return "finally";
		}
	}
	
	
	public static void main(String[] args) {
		T1 t = new T1();
		System.out.println(t.do1());
	}
	
}

