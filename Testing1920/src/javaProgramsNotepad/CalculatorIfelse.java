package javaProgramsNotepad;

import java.util.Scanner;

public class CalculatorIfelse{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no.");
int a=sc.nextInt();
System.out.println("Enter 2nd no.");
int b=sc.nextInt();
System.out.println("Choose an operator +,,-,* or /");
char ch=sc.next().charAt(0);

if(ch=='+'){
System.out.println("Addition="+(a+b));
}
else if(ch=='-'){
System.out.println("Subtraction="+(a-b));
}
else if(ch=='*'){
System.out.println("Multiplication="+(a*b));
}
else if(ch=='/'){
System.out.println("Division="+(a/b));
}
else{
System.out.println("Its not a valid operator");
}

 }
}