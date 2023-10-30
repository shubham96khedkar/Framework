package javaprograms;

public class Methods {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		Methods m = new Methods();
//After new Methods, this () be used always when writing any method
		m.add(a, b);
//The same  variable should be used which is used after  Methods in line no.9
//In line 11 m.add(a,b) should be used and not m.add(int a,int b)
		m.sub(a, b);
		m.div(a, b);
	}

	public void add(int a, int b) {
//In above line same variable should be used after public void
//which is used after m. in line 11
//In bracket(int a ,int b) should be used and not (a,b)
		System.out.println("Addition: " + (a + b));
//In above line (a+b) should be written inside round bracket

	}

	public void sub(int a, int b) {
		System.out.println("Subtraction: " + (a - b));

	}

	public void div(float a, float b) {
		System.out.println("Division: " + (a / b));

	}
}