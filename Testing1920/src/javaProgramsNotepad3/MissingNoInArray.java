package javaProgramsNotepad3;

import java.util.Arrays;

public class MissingNoInArray {

	public static void main(String[] args) {
		//Missing no.in array
		int[] a={1,5,2,4,7,6};

		int sum=0;

		int n=7; //or n=a.length+1

		int summation=n*((n+1)/2);

		for(int i=0;i<a.length;i++){

		sum=sum+a[i];
		//sum=sum+a[i]

		}

		System.out.println("Sum of elements in array is: "+sum);

		System.out.println("Sum of first N natural numbers= "+summation);

		System.out.println("Missing no.in array is: "+(summation-sum));





	}

}
