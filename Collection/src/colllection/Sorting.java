package colllection;

import java.util.*;

public class Sorting {
	
	
	
	public static void main(String[] args) {
		//Map<Employee,String> m = new TreeMap<Employee, String>();
		
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee(1, "male", "Naveen"));
		eList.add(new Employee(2, "male", "Manish"));
		eList.add(new Employee(3, "female", "Manisha"));
		eList.add(new Employee(4, "male", "Aniket"));
		eList.add(new Employee(5, "male", "Mayank"));
		eList.add(new Employee(6, "female", "Versha"));
		eList.add(new Employee(7, "female", "Shanu"));
		eList.add(new Employee(8, "male", "Aaditya"));
		eList.add(new Employee(9, "male", "Deepak"));
		eList.add(new Employee(10, "female", "Megha"));
		
		//Employee e = new Employee();
		
		Sorting a =new Sorting();
		a.sorting(eList);
		System.out.println(eList);
	}
	
	public void sorting(List l)
	{
		Collections.sort(l, (e1,e2) -> e1.toString().compareTo(e2.toString()));
	}

}
