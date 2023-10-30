package javaprograms;

import java.util.Scanner;

public class SwitchPercent {

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the percentage");
		int perc = ab.nextInt();

		switch (perc) {

		case 35-60:
			System.out.println("Pass");
			break;

		case 61 - 75:
			System.out.println("First class");
			break;

		case 75 - 90:
			System.out.println("Distinction");
			break;

		case 90 - 100:
			System.out.println("Merit");
			break;

		case 0 - 35:
			System.out.println("Fail");
			break;

		default:
			System.out.println("Invalid Percentage");

		}

	}

}
