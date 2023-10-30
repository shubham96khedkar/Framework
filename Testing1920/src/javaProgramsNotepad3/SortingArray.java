package javaProgramsNotepad3;

public class SortingArray{

public static void main(String[] args){

int temp=0;

int[] a={5,8,3,2,7,6,4};

for(int i=0;i<a.length;i++){

 for(int j=i+1;j<a.length;j++){

if(a[i]>a[j]){

temp=a[i];

a[i]=a[j];

a[j]=temp;

}

}



}

for(int i=0;i<a.length;i++){

System.out.print(a[i]+",");

}
//print 2nd highest no. in array

System.out.println("\n2nd highest no.is "+a[(a.length)-2]);
}



}