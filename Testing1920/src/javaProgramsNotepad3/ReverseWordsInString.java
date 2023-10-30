package javaProgramsNotepad3;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s="Ram is good boy";

		String[] s1=s.split(" ");

		for(int i=s1.length-1;i>=0;i--){

		System.out.print(s1[i]+" ");

		}

 
	}

}
