package javaprograms;

import java.util.Scanner;

public class Average_5_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first No. ");
		float a = sc.nextFloat();
//In float a,it is not necessary to write "first no." in place of 'a',
//you can use any variable in place of 'a'
		System.out.println("Enter second No. ");
		float b = sc.nextFloat();
		System.out.println("Enter third No. ");
		float c = sc.nextFloat();
		System.out.println("Enter fourth No. ");
		float d = sc.nextFloat();
		System.out.println("Enter fifth No. ");
		float e = sc.nextFloat();
	    float average = (a + b + c + d + e) / 5;
		System.out.println("average :" + average);

	}
}