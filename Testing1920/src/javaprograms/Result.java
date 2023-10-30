package javaprograms;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the Percentage");
		Float percnt = ab.nextFloat();
//Here percnt is a variable
//Any other variable can also be used on place of percnt
		if (percnt >= 35 && percnt < 60) {
//In above line same variable should  be used after if which is used
//after float in line 10
			
			System.out.println("Division:Pass");
		} else if (percnt >= 60 && percnt < 75) {
			System.out.println("Division:First class");
		} else if (percnt >= 75 && percnt < 90) {
			System.out.println("Division:Distinction");
		} else if (percnt >= 90) {
			System.out.println("Division:Merit");
		} else {
//For last remaininng possibility only else should be used and not else if
			System.out.println("Division:Fail");
		}
	}
}