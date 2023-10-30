package javaProgramsNotepad3;

public class NoOfVowels {
	
	public static void main(String[] args) {
		
		int count=0;
		
		String s="bcdfs";

		char[] c=s.toCharArray();

		for(int i=0;i<c.length;i++){

		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){

		count++;

		}
		
		}
				
		System.out.println("no.of vowels="+count);
	}

}
