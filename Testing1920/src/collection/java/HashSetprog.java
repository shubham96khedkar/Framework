package collection.java;

import java.util.HashSet;
import java.util.Set;

public class HashSetprog {

	public static void main(String[] args) {
		
		Set<Character> s=new HashSet<Character>();
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('b');
		s.add('c');
		System.out.println(s);
		s.remove('a');
		
		System.out.println(s);
		System.out.println(s.contains('b'));

	}

}
