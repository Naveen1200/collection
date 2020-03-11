package durga3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("naveen", 85, 85, 85));
		al.add(new Student("manish", 55, 85, 95));
		al.add(new Student("yogi", 75, 65, 75));
		al.add(new Student("nikki", 65, 33, 42));
		al.add(new Student("deepak", 44, 58, 65));
		Predicate<Student> p = (s) -> s.total>200 ;
		
		for(Student s:al)
		{
			if(p.test(s))
			{
				System.out.println(s.name+"::"+s.total);
			}
			
		}
	}

}
