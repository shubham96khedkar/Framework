package javaprograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int originalnumber=153;
		int n=153;
		int num=0;
		int sum=0;
		
		while(n>0) {
			num=n%10;//3,5,1
			n=n/10;//15,1,0
			sum=sum+(num*num*num);//27,152,153
			}
		System.out.println(sum);
		if(sum==originalnumber) {
			System.out.println("It is armstrong no.");
		}else {System.out.println("It is not armstrong no.");
				
			}
		}
    }