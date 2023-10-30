package javaProgramsNotepad3;

public class DuplicateCharacter{

public static void main(String[] args){

String s="pqpqp";

char[] c=s.toCharArray();
//System.out.println(c.length);
//System.out.println(s.length());
for(int i=0;i<c.length-1;i++){

int count=1;

for(int j=i+1;j<c.length-1;j++){

if(s.charAt(i)==s.charAt(j)){

count++;

c[j]=0;

}

}
if(count>1 && c[i]!=0){

System.out.println(c[i]+":"+count);

}
}



}

}