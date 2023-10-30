package javaprograms;

public class FactorialAscending {

	public static void main(String[] args) {
		
		int a=5;
		int factorial=1;
		for(int i=1;i<=a;i++) {
			
			factorial=factorial*i;
		}System.out.println("factorial of 5 is "+factorial);
		
	}
}
