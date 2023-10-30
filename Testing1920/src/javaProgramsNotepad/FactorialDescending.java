package javaProgramsNotepad;

public class FactorialDescending{

public static void main(String[] args){
int number=5;
int fact=1;
for(int i=number;i>0;i--){

fact=fact*i;

}
System.out.println("factorial="+fact);
//i=5: 1*5=5
//i=4: 5*4=20
//i=3: 5*4*3=20*3=60
//i=2: 5*4*3*2=60*2=120
//i=1: 120
}

}