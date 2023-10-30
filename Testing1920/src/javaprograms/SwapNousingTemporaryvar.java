package javaprograms;

public class SwapNousingTemporaryvar {
	
	public static void main(String[] args) {
		
		int a=67;
		int b=76;
		int temp;
		
		temp=a;
		a=b;//updated value of a=76
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
