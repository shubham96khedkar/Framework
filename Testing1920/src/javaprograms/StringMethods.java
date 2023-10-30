package javaprograms;

public class StringMethods {

public static void main(String[] args) {
	
	String s1="Welcome";
	String s2="Welcome";
	System.out.println(s1.concat(s2));
	
	String s3="Pravin";
	System.out.println(s3.charAt(0));
	System.out.println(s3.charAt(3));
	
	System.out.println(s1.equals(s2));
	
	String s4="Welcome";
	String s5="welcome";
	System.out.println(s4.equals(s5));
	
	System.out.println(s4.equalsIgnoreCase(s5));
	
	System.out.println(s3.length());
	
	System.out.println(s5.contains("e"));
	
	System.out.println(s3.substring(1));
	
	System.out.println(s2.substring(3, 6));
	
	String s6="welcome ";
	String s7="welcome";
	System.out.println(s6.equals(s7));
	
	System.out.println(s6.equalsIgnoreCase(s7));
	
	System.out.println(s6);
	System.out.println(s6.trim());
	
	System.out.println(s6.toUpperCase());
	
	System.out.println(s6.toLowerCase());
	
	String s8="Shubham Automation testing";
      String[] s9=s8.split(" ");
	System.out.println(s9[0]);
	System.out.println(s9[1]);
	System.out.println(s9[2]);
	
	String[] s10=s8.split("a");
    System.out.println(s10[0]);
	System.out.println(s10[1]);
	System.out.println(s10[2]);
	
    String[] s11=s8.split("");
    System.out.println(s11[0]);
    System.out.println(s11[2]);
    System.out.println(s11[5]);
    
}	
	
}
