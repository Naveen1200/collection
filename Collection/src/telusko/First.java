package telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class First {

	public static void main(String[] args) {
		// 17.1 java 8 stream API
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
/*		Consumer<Integer> c= new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				
				System.out.println(i);
				
			}
			
		};
		list.forEach(c);*/
		
		
/*		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
*/
		Consumer<Integer> c1 = (Integer i) -> System.out.println(i); // it can be  i -> System.out.println(i); and it work 
		list.forEach(c1);
		list.forEach( i -> System.out.println(i));
		//list.forEach(i -> System.out.println(i));
		
	}

}
