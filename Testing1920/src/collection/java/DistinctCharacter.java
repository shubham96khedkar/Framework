package collection.java;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacter {

	public static void main(String[] args) {
		
		String s="abcadbcdhdphqs";
				
	    char[] c=s.toCharArray();
	    
	    Set<Character> hs=new HashSet<Character>();
	    
	    for(int i=0;i<c.length;i++) {
	    	
	    	hs.add(c[i]);
	    
	    }
	    System.out.println(hs);

	}

}
