package javaProgramsNotepad2;

public class FactorialAsc{

public static void main(String[] args){

int n=6;

int fact=1;

for(int i=1;i<=n;i++){

fact=fact*i;//1,1*2,1*2*3,1*2*3*4,1*2*3*4*5

}
System.out.println(fact);

}

}