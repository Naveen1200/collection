package core;

public class CheckNo {
	
	 public static void main(String[] args) {
	        String str = "1instanceofjava37";
	 
	          Boolean flag1 = str.substring(0, 1).matches("[0-9]");
	 
	if(str.substring(0, 1).matches("[0-9]")){
	 
	 System.out.println("First Character is a number..!");
	 
	 }
	 else{
	   System.out.println("First character is not a number..!");
	}
	}

}
