package javaProgramsNotepad3;

public class StringReverse {

	public static void main(String[] args) {
		String s="Ram is good";

		char[] c=s.toCharArray();
		
		//System.out.println(s.length());==3
		//System.out.println(c.length);==3
		
		
		for(int i=c.length-1;i>=0;i--){

		System.out.print(c[i]);

		}

	}

	}


