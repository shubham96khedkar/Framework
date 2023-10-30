package javaProgramsNotepad;

import java.util.Scanner;

public class Result{

public static void main(String[] args){

 //35-60 pass
 //61-75 first class
 //76-90 distinction
 //90+ merit
 //below 35:- fail
  
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter percentage");
 float perc=sc.nextFloat();
 if(perc>=35 && perc<60){
  System.out.println("Pass");
  }
  else if(perc>=60 && perc<75){
  System.out.println("First class");
  }
  else if(perc>=75 && perc<90){
  System.out.println("Distinction");
  }
  else if(perc>=90){
  System.out.println("Merit");
  }
  else{
  System.out.println("Fail");
  }

 }
}