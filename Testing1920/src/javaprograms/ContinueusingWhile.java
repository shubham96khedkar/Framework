package javaprograms;

public class ContinueusingWhile {
	
	public static void main(String[] args) {
		
		int i=0;
		while(i<=10) {
			if(i==7) {
				i++;
			 continue;
			 
	//after continue it will not come downwards,it will go upwards in while(i<=10)		   
				
			}System.out.println(i);
			i++;
			
		}
	}

}
