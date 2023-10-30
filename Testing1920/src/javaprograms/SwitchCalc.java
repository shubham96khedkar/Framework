package javaprograms;

import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {

		Scanner pq = new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = pq.nextInt();
		System.out.println("Enter second no.");
		int b = pq.nextInt();
		System.out.println("Choose an operator +,-,* or /");
		char operator = pq.next().charAt(0);

		switch (operator) {

		case '+':
			System.out.println("Addition of two nos.is " + (a + b));
			break;

		case '-':
			System.out.println("Subtraction of two nos.is " + (a - b));
			break;

		case '/':
			System.out.println("Division of two nos.is " + (a / b));
			break;

		case '*':
			System.out.println("Multiplication of two nos.is " + (a * b));
			break;

		default:
			System.out.println("Invalid operator");

		}
	}

}