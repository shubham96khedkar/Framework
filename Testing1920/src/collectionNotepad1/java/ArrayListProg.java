package collectionNotepad1.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProg {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		System.out.println(l.isEmpty());
		
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(2);
		
		System.out.println(l);
		
		l.remove(0);
		//In l.remove(0); 0 is index means it will remove element present at 0th index
		
		System.out.println(l);
		
		System.out.println(l.contains(3));
		
		System.out.println(l.size());
		//ArrayList allows us to store Duplicate values
		
		
		//System.out.println(l.isEmpty());
		
		

	}

}
