package javaProgramsNotepad2;

import java.util.Scanner;

public class AsciiProg{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter any alphabet:");

char c=sc.next().charAt(0);

if(c>=65 && c<=90){

System.out.println("Entered alphabet is capital letter");

}
else if(c>=97 && c<=122){

System.out.println("Entered alphabet is small letter");

}

else{

System.out.println("It is not a letter");

}




}

}