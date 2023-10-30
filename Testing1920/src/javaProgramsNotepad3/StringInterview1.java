package javaProgramsNotepad3;

public class StringInterview1 {

	public static void main(String[] args) {
		
		String s="Shubham      is  a      good       boy";
		
		/*String s1=s.replaceAll("\\s+"," ");
		
		System.out.println(s1);*/
		
		String s2="";
		
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			if(c[i]!=' ' || c[i-1]!=' ') {
				
				s2=s2+c[i];
			}
				
		}
		
		System.out.println(s2);	
	}

}
