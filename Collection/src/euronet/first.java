package euronet;

import java.util.*;

public class first<E> {
	
	Stack <E> stk = new Stack<E>();
	public void push(E obj)
	{
		stk.push(obj);
	}
	
	public E pop()
	{
		return stk.pop();
	}

	public static void main(String[] args) {
		first<String> f = new first<String>();
		f.push("hello");
		System.out.print(f.pop()+" ");
		first<Integer> f1 = new first<Integer>();
		f1.push(10);
		System.out.println(f1.pop());
	}

}
