package colllection;

public class RecurEx {
	void print(int n) 
	{ 
	    if (n > 4000) 
	        return; 
	    System.out.println("%d "+ n); 
	    print(2*n);
	    
	    System.out.println("%d "+ n);
	} 
	public static void main(String[] args) {
		RecurEx r = new RecurEx();
		r.print(1000);

	}

}
