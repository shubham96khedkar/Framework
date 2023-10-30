package javaProgramsNotepad3;

import java.util.Arrays;

public class MissingNoInRange {

	public static void main(String[] args) {
		
		int[] c={3,5,9,11,13};

		//Arrays.sort(c);   //{11,12,13,15}

		float sum=0;

		float n=c.length+1;
		//n=5
       
		float a=c[0];
		
		float d=c[1]-c[0];
		
		for(int i=0;i<c.length;i++){ 

		sum=sum+c[i];

		}
		
		float summation=(n/2)*(2*a+(n-1)*d);
		
	   //  n/2 will be in decimal so we have taken everywhere as float
		
		System.out.println("Missing No.in array is: "+(summation-sum));






	}

}
