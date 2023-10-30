package javaProgramsNotepad3;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String s="Ram is going to school"; //

		String[] s1=s.split(" ");//s1={}
		
		String s2="";
		
        //System.out.println(s1.length);

	     for(int i=0;i<s1.length;i++) {
			
			if(i==s1.length-1) {
				
				s2=s1[i]+s2; //School to going is Ram
			}
			else { 
				
				s2=" "+s1[i]+s2;//s2= //s2=Ram, is Ram, going is Ram, to going is Ram,
			}
		}
        
	     System.out.println("Reversed String is ===> "+s2);

		}

}
