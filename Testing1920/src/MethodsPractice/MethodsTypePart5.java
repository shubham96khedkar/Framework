package MethodsPractice;

public class MethodsTypePart5 {
	
	public static void main(String[] args) {
	//calling static method in static method of same class	
		int a=5;
		int b=2;
	System.out.println(add(a,b));
	System.out.println(subtract(a,b));
	}	

	public static int add(int x,int y) {
		
		int c=x+y;
		//System.out.println(c);
		return c;
		
	}
	
	public static int subtract(int x,int y) {
		int d=x-y;
		System.out.println(add(x,y));
	
		return d;
		
	}
	
	
	}
	
