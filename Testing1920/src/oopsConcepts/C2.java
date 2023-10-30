package oopsConcepts;

public class C2 extends A2{

public void showC(){

System.out.println("C class method");

}

public static void main(String[] args){

A2 ob1=new A2();
ob1.showA();
System.out.println("===========");

B2 ob2=new B2();
ob2.showA();
ob2.showB();
System.out.println("===========");


C2 ob3=new C2();
ob3.showA();
ob3.showC();


 

}


}