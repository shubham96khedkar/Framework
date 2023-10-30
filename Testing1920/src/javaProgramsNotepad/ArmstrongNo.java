package javaProgramsNotepad;

public class ArmstrongNo{

public static void main(String[] args){

int n=371;

int a=n%10; //1
int b=n/10; //37
int c=b%10; //7
int d=b/10; //3

if(n<0) {
 	
System.out.println("It is not armstrong no.");	
}
else if(n==(a*a*a+c*c*c+d*d*d)){

System.out.println(n+" is armstrong no.");

}
else{
System.out.println(n+" is not armstrong no.");

}

}

}