package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanNo {

	public static void main(String[] args) {
		String str = "ASDFG1U34Ajvj";
		System.out.println(" result "+ new PanNo().isPanNo(str));
		
		
	}
	
	public boolean isPanNo(String panNo )
	{
		boolean flag = false;
		if(panNo.length() == 10){
		/*Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher matcher = pattern.matcher(panNo);
		flag = matcher.matches();*/
		flag = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}").matcher(panNo).matches();
		}
		return flag;
	}

}
