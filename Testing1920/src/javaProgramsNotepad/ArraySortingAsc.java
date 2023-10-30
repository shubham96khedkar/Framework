package javaProgramsNotepad;	

public class ArraySortingAsc{	

public static void main(String[] args){

int temp;
int[] a={5,8,3,2,7} ;  


for(int i=0;i<a.length;i++){  //5
 for(int j=i+1;j<a.length;j++){ //8

if(a[i]>a[j]){   
                 
temp=a[i]; 
a[i]=a[j]; 
a[j]=temp; 

}
}
 }
for(int k=0;k<a.length;k++) {
	System.out.print(a[k]+",");
	
}

}

}