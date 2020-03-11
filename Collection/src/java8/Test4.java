package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {
		List<Student> stList = Arrays.asList( new Student("Naveen", "01A01", 1, 75, 1),
				new Student("Manish", "01A02", 2, 60, 2),
				new Student("Aaditya", "01A03", 3, 95, 3),
				new Student("Mayank", "01A04", 4, 85, 4),
				new Student("Deepak", "01A05", 5, 63, 1),
				new Student("Yogesh", "01A06", 6, 40, 1),
				new Student("Kanha", "01A07", 7, 52, 3),
				new Student("Prateek", "01A08", 8, 45, 4),
				new Student("Aashua", "01A09", 9, 85, 2),
				new Student("Tanmay", "01A10", 10, 45, 4),
				new Student("Tanu", "01A11", 11, 68, 1));
		Map<Integer, List<Student>> sYear = new HashMap<Integer,List<Student>>();
		//Tester3 t = new Tester3();
		//t.sortByYear(stList);
		for(Student s : stList)
		{
			if(!sYear.containsKey(s.getYear()))
			{
				sYear.put(s.getYear(), new ArrayList<Student>());
				//sYear.get(s.getYear()).add(s);
			}
			
				sYear.get(s.getYear()).add(s);
			
		}
		Student s = new Student();
		sYear = stList.stream().collect(Collectors.groupingBy(Student::getYear));
		System.out.println(sYear);
		
	}

}
