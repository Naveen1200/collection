package colllection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListArray {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		
		System.out.println("lst: "+ll);
		
		ListIterator itr = ll.listIterator();
		
		System.out.println(".. "+ll.getClass().getName());
		
		System.out.println(" poll first "+ll.pollFirst());
		
		System.out.println(" llll..."+ll);
		
		System.out.println(" popp "+ll.poll());
		
		System.out.println(ll);
		
		
		System.out.println("poo last"+ll.pollLast());
		
		System.out.println(" last  k baad "+ ll);
		
		System.out.println(" prin   "+ll.pop()+"..."+ll);
		
		
		LinkedList l1 = new LinkedList<>();
		l1.add(null);
		l1.add("xyz");
		System.out.println(" poll first "+l1.pollFirst());
		System.out.println(" poll first "+l1.pollFirst());
		System.out.println(" poll first "+l1.pollFirst());
		System.out.println(" poll first "+l1.pollFirst());
		
			
		
		
	}

}
