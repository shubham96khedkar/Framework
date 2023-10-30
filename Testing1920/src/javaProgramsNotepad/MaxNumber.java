package javaProgramsNotepad;

import java.util.Scanner;

public class MaxNumber{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 1st No.");
 float a=sc.nextFloat();
 System.out.println("Enter 2nd No.");
 float b=sc.nextFloat(); 
 System.out.println("Enter 3rd No.");
 float c=sc.nextFloat();

 if(a>b && a>c){
  System.out.println("Max.no.is "+a);
 }
 else if(b>a && b>c){
  System.out.println("Max.no.is "+b);
 }
 else{
 System.out.println("Max.no.is "+c);
 }
 
}

}

