package javaProgramsNotepad;

import java.util.Scanner;

public class Avg5Numbers{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter first No.");
 float a=sc.nextFloat();
 System.out.println("Enter second No.");
 float b=sc.nextFloat();
 System.out.println("Enter third No.");
 float c=sc.nextFloat();
 System.out.println("Enter fourth No.");
 float d=sc.nextFloat();
 System.out.println("Enter fifth No.");
 float e=sc.nextFloat();
 float avg=(a+b+c+d+e)/5;
 System.out.println("Average:"+avg);

 }
}