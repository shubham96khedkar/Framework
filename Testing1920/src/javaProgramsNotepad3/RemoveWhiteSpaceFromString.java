package javaProgramsNotepad3;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		
		
		String s="Ra m is a good boy";
		
	    String s2="";

		for(int i=0;i<s.length();i++){
        
		if(s.charAt(i)==' '){
 
		s2=s2+"";//Ram,Ramis

		}else{

		s2=s2+s.charAt(i); //R,Ra,Ram,Ramis,Ramisa

		}
		
		}
		System.out.println(s2);
	}

}
