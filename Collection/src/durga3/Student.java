package durga3;

public class Student {
	
	String name;
	int phy = 0;
	int math = 0;
	int che = 0;
	int total = phy+che+math;
	
	public Student(String name,int phy, int math,int che) {
		this.name = name;
		this.phy = phy;
		this.che = che;
		this.math = math;
		this.total = phy+che+math;
	}
	

}
