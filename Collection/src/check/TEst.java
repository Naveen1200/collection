package check;

import java.util.HashSet;
import java.util.Set;

import colllection.Employee;

public class TEst {
	
	static int x =8;
public static void main(String[] args) {
	//Employee e = new Employee(1, "male", "Naveen");
	/*Set<Immutclass> s = new HashSet<Immutclass> ();
	Immutclass  i = new Immutclass(1, "naveen");
	System.err.println("1"+s.add(new Immutclass(1, "naveen")));
	System.err.println("2"+s.add(new Immutclass(1, "naveen")));
	System.err.println("3"+s.add(new Immutclass(1, "naveen")));
	System.err.println("4"+s.add(i));
	System.err.println(s.add(i));
	System.err.println(s.add(i));
	
	System.out.println("len "+s.size()+ "..."+s);*/
	
	Set<Employee> sEmp = new HashSet<Employee> ();
	Employee e = new Employee(7, "male", "naveen");
	System.out.println(sEmp.add(new Employee(1, "male", "naveen")));
	System.out.println(sEmp.add(new Employee(2, "male", "aaditya")));
	System.out.println(sEmp.add(new Employee(3, "male", "naveen")));
	System.out.println(sEmp.add(new Employee(4, "male", "vishal")));
	System.out.println(sEmp.add(new Employee(5, "male", "naveen")));
	System.out.println(sEmp.add(e));
	System.out.println(sEmp.add(e));
	System.out.println(sEmp.add(e));
	//System.out.println(sEmp.add(new Employee(2, "male", "aaditya")));
	System.out.println(sEmp.size()+"..."+sEmp);
	
}


}
