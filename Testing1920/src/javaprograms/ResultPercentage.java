package javaprograms;

import java.util.Scanner;

public class ResultPercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics marks: ");
		float physics = sc.nextFloat();
		System.out.println("Enter Chemistry marks: ");
		float chemistry = sc.nextFloat();
		System.out.println("Enter Maths marks: ");
		float maths = sc.nextFloat();
		float total_marks = 300;
		float marks_obtained = physics + chemistry + maths;
		System.out.println("Marks obtaineed: " + marks_obtained);
		float percentage = (marks_obtained / total_marks) * 100;
		System.out.println("Percentage: " + percentage);

	}

}
