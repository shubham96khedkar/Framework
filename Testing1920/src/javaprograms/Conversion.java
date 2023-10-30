package javaprograms;

import java.util.Scanner;

public class Conversion{

    public static void main(String[] args) {
    
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter amount in INR");
        float INR = ab.nextFloat();
        float USD=80*INR;
        System.out.println("USD :"+ USD);
        
    }      
}