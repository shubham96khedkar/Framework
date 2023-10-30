package javaprograms;

public class NotepadPrimeNumber {

	public static void main(String[] args) {

		int n = 61;
		boolean flag = false;
		if (n == 0 || n == 1 || n < 0) {
			System.out.println("It is not a prime number");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("It is not a prime number");
					flag = true;
					break;
				}

			}
			if (flag == false) {
				System.out.println("It is a prime number");

			}

		}

	}
}
