package javaProgramsNotepad3;

public class FirstImmediateRepeatedChar {
	
	public static void main(String[] args) {
		
		String s="gpggekaa";
		
		int count=0;
		
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length-1;i++) {
			
			if(c[i]==c[i+1]) {
				
				count++;
				
				System.out.println("First immediate repeated character is "+c[i]);
               
				break;
			}
			
		}
		if(count!=1){
			
			System.out.println("No immediate repeated character is present");
		}
	}

}
