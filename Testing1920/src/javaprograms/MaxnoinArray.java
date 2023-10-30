package javaprograms;

public class MaxnoinArray {
	
	public static void main(String[] args) {
		
		int[] a= {2,1,9,34,67,89,0};
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
			
		}System.out.println(max);
	}

}
