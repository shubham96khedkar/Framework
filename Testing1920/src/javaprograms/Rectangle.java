package javaprograms;

import java.util.Scanner;
//whenever we use Scanner class,we have to write import java.util.Scanner

public class Rectangle {

	public static void main(String[] args) {

		Scanner rs = new Scanner(System.in);
		System.out.println("Enter the length :");
		int a = rs.nextInt();
//In rs.nextInt rs should be used as per the  variable written after Scanner
//int length or int any variable should be used and not int rs
		System.out.println("Enter the breadth");
		int b = rs.nextInt();
//This () should be given after rs.nextInt
//I should be capital in rs.nextInt

		if (a > b || b > a) {
//after if()in bracket < or > sign should be used
//And one operator should be used while writing if then condition in round bracket
			System.out.println("It is a Rectangle");

		} else {
			System.out.println("It is a Square");
		}

	}

}
