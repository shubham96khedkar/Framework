package oopsConcepts;

public class Xyz extends Abc{

public void show(int a){

System.out.println("2");

}

public static void main(String[] args){

Abc ob1=new Abc();
ob1.show(4);

Xyz ob2=new Xyz();
ob2.show(3);

}

}