package javaprograms;

import java.util.Scanner;
//Letter S of scanner should always be capital

public class NavratriColour {
//Same class should be used which is used while creating the class

	public static void main(String[] args) {
//After main (String[] args) {} should be written always
		Scanner jk = new Scanner(System.in);
		System.out.println("Enter day no. of Navratri");
		int dayno = jk.nextInt();

		switch (dayno) {
//Same variable should be used which is used after int in line 13

		case 1:
//after case, the content should be as per the datatype specified in line13
//here the datatype used is int, so after writing case we should enter an integer like 1
//after writng case 1 this colon : should be used and not semicolon ;
			System.out.println("Colour of 1st day is White");
			break;
//after every println statement break should be used with semicolon ;

		case 2:
			System.out.println("Colour of 2nd day is Red");
			break;

		case 3:
			System.out.println("Colour of 3rd day is Royal Blue");
			break;
		case 4:
			System.out.println("Colour of 4th day is Yellow");
			break;
		case 5:
			System.out.println("Colour of 5th day is Green");
			break;
		case 6:
			System.out.println("Colour of 6th day is orange");
			break;
		case 7:
			System.out.println("Colour of 7th day is grey");
			break;
		case 8:
			System.out.println("Colour of 8th day is pink");
			break;
		case 9:
			System.out.println("Colour of 9th day is peacock green");
			break;
		default:
//just like we use else in end in if else condition,same way default must be used in
//end of switch case
			System.out.println("It is not a valid day of Navratri");

		}

	}
}