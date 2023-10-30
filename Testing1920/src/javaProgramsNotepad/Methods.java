package javaProgramsNotepad;

public class Methods {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		Methods m = new Methods();
		m.add(a, b);
		//m.sub(a, b);

	}

	public void add(int a, int b) {
		System.out.println("Addition:" + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

}