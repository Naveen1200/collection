package concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.*;

public class CopyOnWSet {

	public static void main(String[] args) {
		 CopyOnWriteArraySet l = new CopyOnWriteArraySet<>();
			l.add("a");
			l.add("b");
			l.add("c");
			l.add("d");
			l.add("e");
			l.add("f");
			l.add("g");
			
			Iterator itr = l.iterator();
			l.add("n");
			while (itr.hasNext()) {
				String s = (String) itr.next();
				/*if(s.equals("a"))
				itr.remove();*/
				System.out.println(s);
				
			}
			System.out.println("^^^^^^^^^^^^^");
			Iterator itr1 = itr;
			while (itr1.hasNext()) {
				System.out.println("set");
				String s = (String) itr1.next();
				/*if(s.equals("a"))
				itr.remove();*/
				System.out.println(s);
				
			}
		
		
	}

}
