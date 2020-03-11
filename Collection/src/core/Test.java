package core;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.ret();
		
	}
		public int ret()
		{
			int i =0;
			try{
				
				int x = 1/i;
				
				return 1;
			}
			catch(Exception e)
			{
				System.out.println("catch");
				return 1;
				//System.out.println("catch11");
			}
			finally {
				System.out.println("finally");
				return 1;
			}
		}
	
}
