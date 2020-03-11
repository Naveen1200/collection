package durga3;

public class Employee {
	
	String name ;
	int eNo;
	
	public Employee(int eNo, String name) {
		this.eNo = eNo;
		this.name = name;
	}
	
	public String toString()
	{
		return "Emp no "+eNo+" Emp Name "+name;
	}
	

}
