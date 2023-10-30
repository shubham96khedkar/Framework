package javaProgramsNotepad;

public class SwapnowithoutTempVar{

public static void main(String[] args){

int a=5;
int b=2;

//Output:a=2 and b=5

/*b=a+b;//7
a=b-a;//2
b=b-a;//5

System.out.println("a="+a);
System.out.println("b="+b);*/

a=a+b;//7
b=a-b;//5
a=a-b;//2
System.out.println("a="+a);
System.out.println("b="+b);


}

}