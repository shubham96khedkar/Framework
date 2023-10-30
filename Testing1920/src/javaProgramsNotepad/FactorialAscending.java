package javaProgramsNotepad;

public class FactorialAscending{

public static void main(String[] args){

int a=4;
int fact=1;

for(int i=1;i<=a;i++){

	fact=fact*i;

}
System.out.println("Factorial="+fact);

//1!=1
//2!=2*1=2
//3!=3*2*1=3*2=6
//4!=4*3*2*1=4*6=24
//5!=5*4*3*2*1=5*24=120



}


}