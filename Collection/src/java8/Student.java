package java8;

public class Student {
	private String name;
	private String rollNo;
	private int year;
	private int id;
	private long marks;
	public Student() {
		
	}
	
	public Student(String name, String rollNo,int id,long marks, int year) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+name+" RollNo:"+rollNo+" year:"+year;
	}
	
	

}
