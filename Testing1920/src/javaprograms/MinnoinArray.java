package javaprograms;

public class MinnoinArray{

    public static void main(String[] args){

         int[] a={3,1,9,34,67,89,5,2};
         int min=a[0];
         for(int i=1;i<a.length;i++){
           if(a[i]<min){
            min=a[i];
          }
             

       }System.out.println(min);

  }
}