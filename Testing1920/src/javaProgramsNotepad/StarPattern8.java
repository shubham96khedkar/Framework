package javaProgramsNotepad;

public class StarPattern8{

public static void main(String[] args){

/*


   *******
    *****
     ***
      *

*/

for(int i=1;i<=4;i++){  
                         
 for(int j=1;j<=i;j++){   
                          
System.out.print(" ");

}

for(int k=4;k>=i;k--){

System.out.print("*");

}

for(int p=3;p>=i;p--){

System.out.print("*");

}

System.out.println();

}

}

}