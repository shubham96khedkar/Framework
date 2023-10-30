package javaProgramsNotepad;

public class Palindrome{

public static void main(String[] args){

String s="civic";

String s1="";

char[] c=s.toCharArray();
//System.out.println(c[1]);
for(int i=c.length-1;i>=0;i--){

s1=s1+c[i];

}
System.out.println(s1);
if(s1.equals(s)){

System.out.println("It is a palindrome");

}
else{
System.out.println("It is not a palindrome");

}

}




}