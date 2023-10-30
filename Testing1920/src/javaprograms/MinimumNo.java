package javaprograms;

import java.util.Scanner;

public class MinimumNo {

	public static void main(String[] args) {

		Scanner gh=new Scanner(System.in);
		System.out.println("Enter num1 :");
		int a=gh.nextInt();
		System.out.println("Enter num2 :");
		int b=gh.nextInt();
		System.out.println("Enter num3 :");
		int c=gh.nextInt();
		if (a < b && a < c) {
			System.out.println("Minimum no. is:" + a);
		} else if (b < a && b < c) {
			System.out.println("Minimum no. is:" + b);
		} else {
			System.out.println("Minimum no. is:" + c);
		}
	}

}