package javaProgramsNotepad3;

import java.util.Arrays;

public class StringInterview2 {

	public static void main(String[] args) {
		//print the String in Ascending alphabetical order
		String s="shubham";
		
		//String s1="Shubham"
		
		//for s1 string it will sort in order of ascci value.
		//so capital S will come first(65 to 90 ascci value for capital letters)in console
	    //and then small letters will come(97 to 122 ascii value for small letters)
		//for String "Shubham"
		
		char[] c=s.toCharArray();
		
		Arrays.sort(c);
		
		for(int i=0;i<c.length;i++) {
			
			System.out.print(c[i]+" ");
			
		}

	}

}
