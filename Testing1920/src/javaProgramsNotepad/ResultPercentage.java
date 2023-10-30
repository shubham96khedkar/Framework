package javaProgramsNotepad;

import java.util.Scanner;

public class ResultPercentage{

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Science marks:");
  float science=sc.nextFloat();
  System.out.println("Enter Maths marks:");
  float maths=sc.nextFloat();
  System.out.println("Enter English marks:");
  float english=sc.nextFloat();
  float marks_obtained=science+maths+english;
  System.out.println("marks_obtained:"+marks_obtained);
  float total_marks=300;
  float percentage=(marks_obtained/total_marks)*100;
  System.out.println("Percentage:"+percentage);
 }
}