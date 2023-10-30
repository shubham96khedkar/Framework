package javaProgramsNotepad3;

public class ReverseWordsOfSentence {

	public static void main(String[] args) {
		
		String s="Ram is going to school";

		String[] s1=s.split(" ");
		
		//System.out.println(s1.length);

		String s2="";

		for(int i=0;i<s1.length;i++){

		if(s1[i]!=s1[s1.length-(i+1)]){

		s2=s2+" "+s1[s1.length-(i+1)]; //school,schoolto

		}else{

		s2=s2+" "+s1[s1.length-(i+1)];

		}

		}

		System.out.println(s2);

	}

}
