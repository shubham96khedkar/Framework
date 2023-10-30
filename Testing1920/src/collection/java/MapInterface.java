package collection.java;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer,Character> m=new HashMap<>();
		
		//here Integer is key and Character is value
		//So in Map there will be key and value pair
		//Key will be unique and value can be repeated also.
		//If the key repeats then the value corresponding to that key wil show updated value
		m.put(1,'a');
		m.put(2, 'a');
		m.put(1,'b');
		
		m.put(null,'a');
		m.put(null,'v');
		m.put(3,'b');
		
		
		
		System.out.println(m);
		
	}

}
