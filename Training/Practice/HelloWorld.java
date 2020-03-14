import.java.util.Scanner;

class HelloWorld{

public static void main(String args[]){
Scanner reader=new Scanner(System.in);
System.out.println("Enter a number: ");

int number= reader.nextInt();
System.out.println("you entered: " +number);
}
}