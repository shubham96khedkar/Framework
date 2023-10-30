package MethodsPractice;

public class MethodaType2part2 {
	
public static void main(String[] args) {
//calling static method from one class to another class	without creating instance of class
 int q=10;
 int w=12;
	
 //MethodsType mt=new MethodsType();
 //mt.add(q,w);
// mt.subtract(q, w);
 MethodsType.add(q, w);
 MethodsType.subtract(q, w);
 
}	

}
