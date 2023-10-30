package collection.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String s="abcdabg";

		char[] c=s.toCharArray();

		HashMap<Character,Integer> m=new HashMap<>();

		for(char ch:c){

		if(m.containsKey(ch)){

		m.put(ch,m.get(ch)+1);

		}else{

		m.put(ch,1);

		}

		}
		for(Map.Entry<Character,Integer> e:m.entrySet()){
			
	// if(e.getValue()==2)		

		System.out.println(e.getKey()+":"+e.getValue());
	  // break;
	    

		}

	}

}
