package concurrent.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread {
	
	static ConcurrentHashMap m = new ConcurrentHashMap();
	
	
	
	@Override
	public  void run() {
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			
		}
		System.out.println("concurrent map");
		m.put(101, "k");
	}
	
	public static void main(String[] args) throws InterruptedException  {
		
		m.put(101, "a");
		m.put(102, "b");
		m.put(103, "c");
		
		MyThread t = new MyThread();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			System.out.println("heloo::: "+m.get(i));
			
			Thread.sleep(1000);
			
		}
		
		System.out.println(m);
		
	}
	

}
