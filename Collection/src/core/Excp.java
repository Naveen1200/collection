package core;

 class Excp extends Exception {

	
}
class Main{
	public static void main(String[] args) {
		try{
			throw new Excp();
		}
		catch(Exception e)
		{
			System.out.println(" catch ");
		}
		finally {
			System.out.println(" finally");
		}
		
		
		
	}
} 
