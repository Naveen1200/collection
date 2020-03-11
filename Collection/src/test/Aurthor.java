package test;

public class Aurthor {
private String name ;
private String gender ;
private String email ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub;
		return "Name: "+name+", gender: "+gender+", e-mail:"+email;
	}
public Aurthor(String name, String gender, String email) {
	this.email = email;
	this.gender = gender;
	this.name = name;

}

}
