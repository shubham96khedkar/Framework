package javaProgramsNotepad3;

public class ReveseStringWithoutChangingSymbol {
	
	public static void main(String[] args) {
		
		String s="Ab,c,de!$";

		String s1="";

		char[] c=s.toCharArray();

		for(int i=c.length-1;i>=0;i--){

		if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){

		s1=s1+s.charAt(i); //$!ed,c,bA

		}else{

		s1=s1+s.charAt(i); //$!
		 }
        }
		System.out.println(s1);
		
	}

}
