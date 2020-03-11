package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,9,8,7,5,6,3,2,1,4);
		Stream<Integer> stream = l.stream();
		List list = stream.filter(a -> a%2==0).distinct().collect(Collectors.toList());
		System.out.println(list);
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i)./*distinct().*/collect(Collectors.toList());
		//System.out.println(squaresList);
		
		//Random random = new Random();
		//random.ints().limit(10).forEach(System.out::println);
		//System.out.println(random);
		
	
	}
	

}
