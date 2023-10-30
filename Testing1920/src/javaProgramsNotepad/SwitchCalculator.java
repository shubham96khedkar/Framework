package javaProgramsNotepad;

import java.util.Scanner;

public class SwitchCalculator{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 1st no.");
 int a=sc.nextInt();
 System.out.println("Enter 2nd no.");
 int b=sc.nextInt();
 System.out.println("Choose an operator +,-,* or /");
 char ch=sc.next().charAt(0);

 switch(ch){
 case '+':
 System.out.println("Sum="+(a+b));
 break;

 case '-':
 System.out.println("Subtraction="+(a-b));
 break;

case '*':
 System.out.println("Multiplication="+(a*b));
 break;

 case '/':
 System.out.println("Division="+(a/b));
 break;
 
 default:
 System.out.println("It is not a valid operator");
}
  }

 
}

  
 


