package javaProgramsNotepad;

public class SwapnoTempVar{

public static void main(String[] args){

int a=8;
int b=6;
int temp;

//Output: a=6,b=8
temp=a;//8
a=b;//6
b=temp;//8
System.out.println("a="+a);
System.out.println("b="+b);

/*temp=b;//6
b=a;//8
a=temp;//6
System.out.println("a="+a);
System.out.println("b="+b);*/
}


}