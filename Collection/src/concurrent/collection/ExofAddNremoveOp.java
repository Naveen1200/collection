package concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExofAddNremoveOp {

	public static void main(String[] args) {
		
		 CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
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
		System.out.println("////////////////");
		Iterator itr1 = itr;
		while (itr1.hasNext()) {
			System.out.println("hello");
			String s = (String) itr1.next();
			/*if(s.equals("a"))
			itr.remove();*/
			System.out.println(s);
			
		}
		//l.remove(5);
		//System.out.println(l);
		
		
		
		
		
		
	}

}
