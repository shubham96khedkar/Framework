package javaProgramsNotepad2;

public class FibonacciSeries{

public static void main(String[] args){

int a=0;

int b=1;

int count=5;

int n;
System.out.print("Fibonacci series is ");
System.out.print(a+","+b);

for(int i=1;i<count;i++){

n=a+b;  //1,2,3,5

System.out.print(","+n); //1,2,3,5

a=b; //1,1,2,3

b=n;//1,2,3,5

}

}


}