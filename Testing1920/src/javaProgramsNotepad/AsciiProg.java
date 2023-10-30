package javaProgramsNotepad;

import java.util.Scanner;

public class AsciiProg{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a character");
 char ch=sc.next().charAt(0);
 
 if(ch>=65 && ch<=90){
 System.out.println("It is capital letter");
 }
 else if(ch>=97 && ch<=122){
 System.out.println("It is small letter");
 }else{
  System.out.println("It is not a letter");
 }




 }



}