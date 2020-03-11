package java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicates {

public static void main(String[] args) {
	
	//Predicate<Integer> p  = ()->();
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	
	System.out.println(filtered);
	
}


	
}
