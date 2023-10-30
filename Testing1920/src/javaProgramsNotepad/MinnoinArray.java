package javaProgramsNotepad;

public class MinnoinArray{

public static void main(String[] args){

int[] a={2,1,9,34,64,89,0};

int min=a[0];

for(int i=1;i<a.length;i++){

if(a[i]<min){
min=a[i];
}

}
System.out.println("minimum no.is "+min);

}

}