package check;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassTest {
	
	public static void main(String[] args) {
		List<Immutclass> l = Arrays.asList(new Immutclass(1, "Naveen"),new Immutclass(1, "nvn"), new  Immutclass(1, "Naveen"));
		//Collections.singleton(l);
		System.out.println(l);
		List i1 = Arrays.asList("a","b","x");
		i1.remove("a");
		
	}

}
