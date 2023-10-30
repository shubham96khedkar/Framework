package javaProgramsNotepad;

public class Pallindrome1{

public static void main(String[] args){

String s="civicf";

char[] a=s.toCharArray();

for(int i=0;i<=(a.length-1);i++){

System.out.print(a[i]);

}

System.out.print("||||");
for(int j=(a.length-1);j>=0;j--){

System.out.print(a[j]);

}


int i = 0;
int j = 0;
if(a[i]==a[j]){

System.out.println("It is a pallindrome");

}
else{

System.out.println("It is not a pallindrome");
}
}

}