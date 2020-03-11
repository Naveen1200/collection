package check;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAlfabate {
	
	
	public void check ()
	{
		Character charArray[] = { 'N', 'a', 'v', 'e', 'e', 'n' }; 
		  
        // Convert charArray to IntStream 
        IntStream 
            intStream 
            = Stream 
  
                  // Convert charArray into Stream of characters 
                  .of(charArray) 
  
                  // Convert the Stream of characters into IntStream 
                  .flatMapToInt(IntStream::of); 
  
        // Print the elements of the IntStream 
       // System.out.println("IntStream:"); 
        intStream.forEach(System.out::println); 
	}
	
	public void fun(String str , int i)
	{
		//System.out.println(str.chars().mapToObj(ch->(char)ch)); 
		str.chars().mapToObj(ch->(char)ch).toArray();
		System.out.println((char)str.chars().mapToObj(ch->(char)ch).toArray()[i]);
		for(Object x : str.chars().mapToObj(ch->(char)ch).toArray())
		{
			//System.out.println((char)x);
		}
	}

	public static void main(String[] args) {
		
		FindAlfabate a = new FindAlfabate();
		//a.fun("naveen", 2);
		a.check();
		ArrayList< Integer > al = new ArrayList<>();
		al.toArray();
	}

}
