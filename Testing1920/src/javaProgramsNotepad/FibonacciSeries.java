package javaProgramsNotepad;

public class FibonacciSeries{

public static void main(String[] args){

int a=0;
int b=1;
int c=5;
int n;
System.out.print(a+","+b);

for(int i=1;i<c;i++){

n=a+b;   //1,2,3,5
System.out.print(","+n);//1,2,3,5
a=b;     //1,1,2,3
b=n;     //1,2,3,5

}




}

}