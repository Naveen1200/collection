package durga3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList();
		
		al.add(new Employee(1, "naveen"));
		al.add(new Employee(10, "manish"));
		al.add(new Employee(22, "aaditya"));
		al.add(new Employee(12, "mayank"));
		al.add(new Employee(15, "anil"));
		al.add(new Employee(51, "dev"));
		al.add(new Employee(16, "savan"));
		al.add(new Employee(18, "hari"));
		al.add(new Employee(61, "ravi"));
		System.out.println(al);
		//Employee e1 = new  Employee(eNo, name)
		Comparator<Employee> c = (i1,i2) -> (i1.eNo<i2.eNo) ?-1 : (i1.eNo>i2.eNo)? 1 :0 ;
		Comparator<Employee> c1 = (i,j) -> i.name.compareTo(j.name);
		/*System.out.println(al);
		
		Comparator<Integer> c = (i1,i2) -> (i1<i2) ?-1 : (i1>i2)? 1 :0 ;
			
		
			
			  Collections.sort(al, c);*/
		Collections.sort(al, c1);
			  
			  System.out.println(al);
			  
			  Predicate<Integer> p ;
	}
	
}


