package javaProgramsNotepad3;

public class ArmstrongNo{

public static void main(String[] args){

int temp;

int n=153;

int num=0;

int sum=0;

temp=n;

while(n>0){

num=n%10;

n=n/10;

sum=sum+(num*num*num);

}

if(sum==temp){

System.out.println(temp + " is armstrong no.");

}else
{
System.out.println(temp + " is not armstrong no.");

}

}


}