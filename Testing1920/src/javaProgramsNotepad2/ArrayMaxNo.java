package javaProgramsNotepad2;

public class ArrayMaxNo{

public static void main(String[] args){

int[] a={12,45,30,58,90};

int max=a[0];

for(int i=1;i<a.length;i++){

if(a[i]>max){

max=a[i];

}

}

System.out.println("Maximum No.is "+max);


}


}