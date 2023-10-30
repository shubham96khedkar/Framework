package javaprograms;

public class PrimeNo {

	public static void main(String[] args) {

		int n =7 ;
		boolean flag = false;
		if (n == 0 || n == 1 || n < 0) {
			System.out.println("It is not prime no.");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("It is not prime no.");
					flag = true;
					break;
				}

			}
			if (flag == false) {
				System.out.println("It is prime no.");
			}
		}
	}

}
