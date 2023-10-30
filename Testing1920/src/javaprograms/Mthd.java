package javaprograms;

public class Mthd {

    public static void main(String[] args){
    
        float a = 25.5f;
        float b = 5.23f;
        Mthd s = new Mthd();
        s.plus(a,b);
        s.minus(a,b);
        s.divide(a,b);
//Here plus,minus,divide are variables
//Any other variables can also be used in place of plus,minus,divide
    }

   public void plus(float a,float b) {
   System.out.println("Addition: " +(a+b));

   }
   public void minus(float a,float b){
   System.out.println("Subtraction: " +(a-b)); 

   }
   public void divide(float a,float b){
   System.out.println("Division: " +(a/b));

   }    

}