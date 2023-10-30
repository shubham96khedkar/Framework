package javaProgramsNotepad2;
import java.util.Scanner;
public class ArmstrongNo{

public static void main(String[]  args){
	
Scanner sc=new Scanner(System.in);

System.out.println("Enter original no. ");

int originalno=sc.nextInt();
//int originalno=371; 

int n=originalno;

//int n=371;

int num=0;

int sum=0;

while(n>0){

num=n%10; //3,5,1

n=n/10;  //15,1,0

sum=sum+num*num*num; //27,152,153

}
//System.out.println(sum);

if(sum==originalno){

System.out.println(originalno+" is armstrong no.");

}
else{

System.out.println(originalno+" is not armstrong no.");

}


}

}