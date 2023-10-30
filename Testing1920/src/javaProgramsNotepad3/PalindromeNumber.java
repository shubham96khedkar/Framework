package javaProgramsNotepad3;

public class PalindromeNumber {

public static void main(String[] args) {

	int n=121;

	int temp;

	int r; //This r means remainder

	int sum=0;

	temp=n;

	while(n>0){

	r=n%10; //1,2,1

	sum=(sum*10)+r; //1,12,121

	n=n/10; //12,1,0

	}

	if(sum==temp){

	System.out.println("It is palindrome no.");

	}else{

	System.out.println("It is not palindrome no.");

	}




	}

}
