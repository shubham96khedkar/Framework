package javaprograms;

import java.util.Scanner;

public class MaximumNo {

    public static void main(String[] args) {
     
        Scanner pq=new Scanner(System.in);
        System.out.println("Enter num1 :");
        int a=pq.nextInt();
        System.out.println("Enter num2 :");
        int b=pq.nextInt();
        System.out.println("Enter num3 :");
        int c=pq.nextInt();
   
        if(a>b && a>c){
            System.out.println("Maximum no. is:"+ a);
//Use this ; after every round bracket and before ending curly bracket,
//when using if condition
        } else if(b>a && b>c){
            System.out.println("Maximum no. is: "+ b);
//In ("Maximum no. is"+ b) + b should be written inside round bracket,
//and not after closing round bracket
        }else {System.out.println("Maximum no. is :" + c);}
   }
}