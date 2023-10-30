package collection.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProg {
	
	public static void main(String[] args) {
		//List<Integer> l=new ArrayList<Integer>();
		List<Character> l=new ArrayList<Character>();
		//System.out.println(l.isEmpty());
		/*l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(1);
		l.add(1);*/
		//System.out.println(l);
		//System.out.println(l.isEmpty());
		//
		//l.remove(2);//this is remove by index
		//l.removeAll(l);
		//System.out.println(l);
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		System.out.println(l.contains('b'));
		System.out.println(l);
		int s=l.size();
		System.out.println(s);
		
		
		
	}

}
