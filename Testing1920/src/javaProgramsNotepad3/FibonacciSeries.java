package javaProgramsNotepad3;

public class FibonacciSeries{

public static void main(String[] args){

int a=0;

int b=1;

int n;

int count=9; //If couunt=9 then it will show fibonacci series upto 10 numbers

System.out.print(a+","+b);

for(int i=1;i<count;i++){

n=a+b;

System.out.print(","+n);

a=b;

b=n;

}

}
}