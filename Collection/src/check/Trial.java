package check;

public class Trial {
	
	int num = 10;
	void change(Trial ref)
	{
		ref.num = 20;
		ref = new Trial();
		ref.num = 30;
		ref = null;
	}
	
	public static void main(String[] args) {
		Trial t = new  Trial();
		t.change(t);
		System.out.println(t.num);
	}

}
