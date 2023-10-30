package MethodsPractice;

public class MethodsType {
	
public static void main(String[] args) {
	//Calling static method in same class
	int a=8;
	int b=5;
	
	add(8,5);
	//subtract(a,b);
	
}	

public static void add(int x,int y) {
	
	int c=x+y;
	System.out.println(c);
	
}
public static void subtract(int x,int y) {
	
	int d=x-y;
	System.out.println(d);
}
}
