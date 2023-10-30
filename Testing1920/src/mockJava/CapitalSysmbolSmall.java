package mockJava;

import java.security.DomainCombiner;

public class CapitalSysmbolSmall {
	
	public static void main(String[] args) {
		
		String s="sTUsv%$&sfTv";
		
		String capital="";
		
		String small="";
		
		String symbol="";
		
	    char[] c=s.toCharArray();
	    
	    for(int i=0;i<c.length;i++) {
	    	
	    	if(s.charAt(i)>=65 && s.charAt(i)<=90) {
	    		
	    		capital=capital+s.charAt(i);
	    		
	    	}
	    	else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
	    		
	    		small=small+s.charAt(i);
	    		
	    	}else {
	    		
	    		symbol=symbol+s.charAt(i);
	    		
	    	}
	    	
	    	
	    }
	    System.out.println("String cap: "+capital);
	    
	    System.out.println("String small: "+small);
	    
	    System.out.println("String symbol: "+symbol);
	    
	    
	    //For same String print duplicate character without using count
	    
	    
	    //String s1=small;
	    
	     for(int i=0;i<s.length();i++) {
	    	
	    	for(int  j=i+1;j<s.length();j++) {
	    		
	    		if(s.charAt(i)==s.charAt(j)) {
	    			
	    			System.out.println(c[i]);
	    			
	    			break;
	    		
	    		}
	    		
	    	}
	   	 
	    }
	    
	    
	}
}
	
	
	


