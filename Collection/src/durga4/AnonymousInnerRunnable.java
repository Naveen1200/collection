package durga4;

public class AnonymousInnerRunnable {
	
	/*Runnable r = new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<10;i++)
			{
				System.out.println("child class");
			}
		}
	};*/
	
	
	public static void main(String[] args) {
		AnonymousInnerRunnable a = new AnonymousInnerRunnable();
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("child class");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		//a.t.start();
		//a.r.run();
		for(int i=0;i<10;i++)
		{
			System.out.println("main class");
		}
	}

}
