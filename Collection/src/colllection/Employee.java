package colllection;

import java.util.ArrayList;
import java.util.Collections;

import check.Immutclass;

public class Employee {
	private  int id;
	private  String gender;
	private  String name;
	Employee e;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id , String gender, String name) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public static void main(String[] args) {
	/*	ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee(1, "male", "Naveen"));
		eList.add(new Employee(2, "male", "manish"));
		eList.add(new Employee(3, "female", "Manisha"));
		eList.add(new Employee(4, "male", "Aniket"));
		eList.add(new Employee(5, "male", "Mayank"));
		eList.add(new Employee(6, "female", "versha"));
		eList.add(new Employee(7, "female", "Shanu"));
		eList.add(new Employee(8, "male", "Aaditya"));
		eList.add(new Employee(9, "male", "Deepak"));
		eList.add(new Employee(10, "female", "Megha"));
		
		Employee e = new Employee();
		e.sort1(eList);
		System.out.println(eList);*/
	}
	
	public String action() {
		return gender+name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "gender:"+gender+" name:"+name+" id:"+id;
	}
	
	@Override
	public int hashCode() {
		System.err.println("id is "+this.name.hashCode());
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this)
			return true;
	if(obj == null || obj.getClass() != this.getClass())
		return false;
	e = (Employee)obj;
	return e.name.equals(this.name) && e.id==this.id;
	}
	
	public void sort1(ArrayList<Employee> l){
		//sorting(l);
		Collections.sort(l, (e1,e2) -> e1.getName().compareTo(e2.getName()));
	}
	public void sorting(ArrayList<Employee> l)
	{
		Collections.sort(l, (e1,e2) -> e1.getGender().compareTo(e2.getGender()) );
	}

}
