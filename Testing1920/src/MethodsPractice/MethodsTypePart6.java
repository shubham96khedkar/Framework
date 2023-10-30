package MethodsPractice;

public class MethodsTypePart6 {

	public static void main(String[] args) {
	//calling static method in non static method of same class	
		int a=15;
		int b=5;
		MethodsTypePart6 mt=new MethodsTypePart6();
		System.out.println(add(a,b));
		System.out.println(mt.div(a, b)); 
	    /*for calling non static method(div x,y) in static(main method) method,
		we have created instance of that class and then by doing mt.div, we
		have first called div(a,b) non static method in static (main method)method and then we called
		static method add(x,y) in non static method div(x,y)*/
		
	     
     
	}

	public static int add(int x,int y) {
		int c=x+y;
		return c;
		
	}
	
	public int div(int x,int y) {
		
		int d=x/y;
		System.out.println(add(x,y));
		return d;
	}
}
