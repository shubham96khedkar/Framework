package javaProgramsNotepad3;

import java.util.Scanner;

public class Pallindrome {
	
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
	
System.out.println("Input String");
String s=sc.next();//Taking input as String
	
	
String s1="";

char[] ch=s.toCharArray();

for(int i=s.length()-1;i>=0;i--){

s1=s1+ch[i];

}

//System.out.println(s1);

if(s1.equals(s)){

System.out.println("It is pallindrome");

}else
{

System.out.println("It is not pallindrome");


}

}

}
