package javaprograms;

import java.util.Scanner;

public class EvenandOddno {
	
	public static void main(String[] args) {
		
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter a no.");
	int a=ab.nextInt();
	
	if(a%2==0) {
		System.out.println("It is even no.");
	}else {
		System.out.println("It is odd no.");
		
	}
	
	}
	
}

