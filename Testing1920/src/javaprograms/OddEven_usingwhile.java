package javaprograms;

public class OddEven_usingwhile {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			
			if(i%2==0) {
				System.out.println(i+" It is even no.");
			}else {
				System.out.println(i+" It is odd no.");	
			}i++;
		}
	}
}

