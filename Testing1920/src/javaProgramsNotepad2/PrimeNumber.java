package javaProgramsNotepad2;

public class PrimeNumber{
		
public static void main(String[] args){

int n=17;

int temp=0;

if(n==0 || n==1 || n<0){

System.out.println(n+" is not a prime no.");

}

else{

for(int i=2;i<n;i++){

if(n%i==0){

temp=temp+1;

}

}
if(temp>1){

System.out.println(n+" is not a prime no.");

}
else{

System.out.println(n+" is a prime no.");

}
}

}
}