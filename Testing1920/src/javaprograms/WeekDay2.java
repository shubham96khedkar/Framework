package javaprograms;

import java.util.Scanner;

public class WeekDay2 {

	public static void main(String[] args) {

		Scanner st = new Scanner(System.in);
		System.out.println("Enter day no.of week");
		int dayno = st.nextInt();

		if (dayno == 1) {
			System.out.println("Monday");
		} else if (dayno == 2) {
			System.out.println("Tuesday");
		} else if (dayno == 3) {
			System.out.println("Wednesday");
		} else if (dayno == 4) {
			System.out.println("Thursday");
		} else if (dayno == 5) {
			System.out.println("Friday");
		} else if (dayno == 6) {
			System.out.println("Saturday");
		} else if (dayno == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("It is not a valid day no.of week");
		}

	}
}
