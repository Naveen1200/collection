package check;

import java.util.ArrayList;
import java.util.List;

public class Two {
	
	public static void main(String[] args) {  
    	List<String> names = new ArrayList<String>();
    	names.add("Jai");
    	names.add("Mahesh");
    	names.add("Ajay");
    	names.add("Hemant");
    	names.add("Vishal");
    	//Using Stream and Lambda expression
    	long count = names.stream().filter(str->str.length()<5).count();
            System.out.println(count+" strings with length less than 5");
    }  

}
