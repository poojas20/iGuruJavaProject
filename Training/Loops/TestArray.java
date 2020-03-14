  class TestArray{

public static void main(String args[]){

	double[] myList={1.9, 2.9, 4.1, 3.4, 3.5};

		//for(double z:myList)			//Print array elements using ForEach loop
		//{
		//System.out.println(z);
		//}

		for(int i=0; i<myList.length; i++){
		System.out.println(myList[i]);
		}

//Summing all elements

double total=0;
for(int i=0; i<myList.length; i++){
total=total+myList[i];
}
System.out.println("Total is: "+total);
 
//finding maximum value

double max=myList[0];
for(int i=1; i<myList.length; i++){
	if (myList[i]>max){
		max=myList[i];
		}
}
System.out.println("Max is: "+max);

	String[] s=new String[4];
	s[0]="Java";
	s[1]="Selenium";
	s[2]="BigData";
	s[3]="DevOps";

  //Print all the array elemenys	
	for(String str:s)  //For each or Enhance loop
		{
		System.out.println(str);
		}
}
}
