package javaprograms;

public class SwapNowithoutTemporaryvar {
	
	public static void main(String[] args) {
		//a=2 and b=5
		int a=5;
		int b =2;
		
		a=a+b;//updated value of a=7
		b=a-b;//b=5
		a=a-b;//a=7-5
		
		System.out.println(a);
		System.out.println(b);
	}
}
