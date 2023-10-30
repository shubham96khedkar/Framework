package MethodsPractice;

public class MethodsTypePart7 {
	
	public static void main(String[] args) {
	//Calling non static method div(x,y)in another non static method mul(x,y)	
		int a=10;
		int b=5;
	/*for calling non static method(mul x,y) in static(main method) method,
		we have created instance of that class and then by doing mt.mul, we
		have first called mul(a,b) non static method in static (main method)method and then we called
		non static method div(x,y) in another non static method mul(x,y)*/
		MethodsTypePart7 mt=new MethodsTypePart7();
		System.out.println(mt.mul(a, b));
		
	}
    
	public int div(int x,int y) {
    	
    	int d=x/y;
    	return d;
    }
	
	public int mul(int x,int y) {
		
		int m=x*y;
		System.out.println(div(x,y));
		return m;
		
	}
}
