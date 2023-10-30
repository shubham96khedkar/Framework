package javaProgramsNotepad3;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		
		int[] a={10,20,20,20,30,30,40,50,50};

		for(int i=0;i<a.length;i++){

		int count=1;

		for(int j=i+1;j<a.length;j++){

		if(a[i]==a[j]){

		count++;

		a[j]=0;

		}


		}

		if(count>=1 && a[i]!=0){

		System.out.print(a[i]+",");
		}

		}

	}

}
