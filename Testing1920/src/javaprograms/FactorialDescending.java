package javaprograms;

public class FactorialDescending {

	public static void main(String[] args) {
		
		int a=4;
		int factorial=1;
		
		for(int i=a;i>0;i--) {
			factorial=factorial*i;
			
		}System.out.println("Factorial of 4 is "+factorial);
	}
}
