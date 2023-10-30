package MethodsPractice;

public class MethodsTypePart4 {
	
	public static void main(String[] args) {
	//calling non static method from one class to another class
		//we have to create instance of that class 
		//vo method jis class mein hai ,us class ka instance create karna padega
		int q=100;
		int w=20;
		
		MethodsTypePart3 mt=new MethodsTypePart3();	
		System.out.println(mt.div(q, w));
	}

}
