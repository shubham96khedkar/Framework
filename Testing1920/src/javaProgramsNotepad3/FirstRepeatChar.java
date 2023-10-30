package javaProgramsNotepad3;

public class FirstRepeatChar {

	public static void main(String[] args) {
		
		String s="geekforgeeks";
        
		char[] c=s.toCharArray();
        
		for(int i=0;i<c.length;i++){
        
		int count=1;
			
		 for(int j=i+1;j<c.length;j++){
     
			 
		 if(s.charAt(i)==s.charAt(j)){

		 count++;
		 
		 System.out.println("First repeated character is "+c[i]);
         
		 break;
	    }
         
		}

      /* if(count!=2) {
    	
    	 System.out.println("no first repeated character is present ");  
    	  
         }*/
		}

	}

}
