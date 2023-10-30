package javaProgramsNotepad;

public class PrimeNo{

public static void main(String[] args){

int n=6;
int temp=0;

if(n==0 || n==1 || n<0){

System.out.println("Its not a Prime no.");

}
else {

 for(int i=2;i<n;i++){

if(n%i==0){

temp=temp+1;

}

}
if(temp>0){

System.out.println("It is not prime no.");
}
else{

System.out.println("It is a Prime no.");
}
}

}

}