class TestArray1{
public static void main(String args[]){

int[] testlist={1,2,3,4,5};

for(int a:testlist){
System.out.println(a);
}

int total=0;
for(int i=0; i<testlist.length; i++){
total=total+testlist[i];
}
System.out.println("sum is: " +total);

//finding maximum number

int max=testlist[0];
for(int i=1; i<testlist.length; i++){
if(testlist[i]>max){
max=testlist[i];
}
}
System.out.println("maximum number is: " +max);
}
}  