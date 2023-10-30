package javaProgramsNotepad3;

public class RemoveOccuranceOfACharacter {

	public static void main(String[] args) {
		
		String s="Ram is playing casioabc";

		String s2="";

		for(int i=0;i<s.length();i++){

		if(s.charAt(i)=='a'){

		s2=s2+""; //R,Rm is pl

		}else{

		s2=s2+s.charAt(i); //R,Rm ,Rm i,Rm is,Rm is pl

		}

		}

		System.out.println(s2);
		
	}

}
