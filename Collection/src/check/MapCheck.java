package check;

import java.util.HashMap;
import java.util.Map;

public class MapCheck {
	public static void main(String[] args) {
		Map<Integer , String> map = new  HashMap<Integer, String>();
		map.put(1, "naveen 1");
		map.put(2, "naveen 1");
		map.put(3, "naveen 1");
		map.put(4, "naveen 1");
		map.put(1, "naveen 2");
		map.put(2, "naveen 2.2");
		//map.put(1, "naveen 1");
		
		System.out.println(map);
	}
	
	@Override
	public String toString() {
		
		System.out.println(super.hashCode());
		
		
		return super.toString();
	}

}
