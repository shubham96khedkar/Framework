package collectionNotepad1.java;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		
		Set<Character> s=new HashSet<Character>();
		
		s.add('a');
		s.add('b');
		s.add('a');
		
		System.out.println(s);
		
		//s.remove('b') is not possible bcoz Set is unordered collection of data
		
	}

}
