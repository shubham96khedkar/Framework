package MethodsPractice;

public class Return {
	
public static void main(String[] args) {
	
	int a=8;
	int b=5;
	
	System.out.println(add(a,b));
	//System.out.println(subtract(a,b));
}	

public static int add(int x,int y) {
	
	int c=x+y;
	System.out.println(subtract(x,y));
	
	return c;
   //System.out.println(add(x,y));
	
}
public static int subtract(int x,int y) {
	
	int d=x-y;
	return d;
}

}
