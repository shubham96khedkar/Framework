package MethodsPractice;

public class MethodsTypePart3 {
	
	public static void main(String[] args) {
  //calling non static method in same class	
		//we have to create instance of that class
		int a=60;
		int b=30;
		
		MethodsTypePart3 mt=new MethodsTypePart3();
		System.out.println(mt.div(a, b));
	}
	
 public int div(int x,int y) {
	 
	int div=x/y;
	return div;
	 
 }
}
