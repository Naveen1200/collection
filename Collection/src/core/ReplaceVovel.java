package core;

public class ReplaceVovel {

	public static void main(String[] args) {
		String s = "My name naveen joshi";
				
		String copy = "";
		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
			copy =	copy+s.replace(s.charAt(i), '*').substring(i,i+1);
			}
			else{
				copy = copy +s.charAt(i);
			}
		}*/
		copy =	s.replaceAll("[AaEeIiOoUu]", "*");
		
		System.out.println(copy);
	}

}
