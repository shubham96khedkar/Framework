package oopsConcepts;

public class C1 extends B1{

public void showC(){

System.out.println("C1 class method");

}

public static void main(String[] args){

A1 ob1=new A1();
ob1.showA();
System.out.println("============");


B1 ob2=new B1();
ob2.showA();
ob2.showB();
System.out.println("============");


C1 ob3=new C1();
ob3.showA();
ob3.showB();
ob3.showC();


}

}