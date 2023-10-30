package javaProgramsNotepad;

public class MaxnoinArray{

public static void main(String[] args){

int[] a={2,1,9,34,67,89,0};
int max=a[0];
for(int i=1;i<a.length;i++){

if(a[i]>max){
max=a[i];
}

}
System.out.println("Maximum no.is "+max);

//i=1: 1>2--max=a[0]=2
//i=2: 9>2--max=9
//i=3: 34>9---max=34
//i=4: 64>34---max=64
//i=5: 89>64---max=89
//i=6: 0>89
//i=7: for loop will break
 }

}

