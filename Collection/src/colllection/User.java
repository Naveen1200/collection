package colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class User {
	
	private int id;
	private String gender;
	private String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User (int id , String gender, String name) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		return "Name:"+name;
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
	
	public void sorting(List<User> l)
	{
		Collections.sort(l,(u1,u2)-> u1.name.compareTo(u2.name));
	}

	public static void main(String[] args) {
		List<User> uList =  Arrays.asList(new User(1, "male", "Naveen"),new User(2, "male", "Neeraj"),new User(3, "male", "Mayank"),new User(4, "male", "Aashu"),new User(4, "male", "Aaditya"),new User(5, "male", "Manish"));
		
			User a = new User();
			a.sorting(uList);
			System.out.println(uList);

	}

}
