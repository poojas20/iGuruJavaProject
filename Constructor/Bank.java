class Bank{


Bank(){

System.out.println("In Default Constructor");
}

Bank(int i){
System.out.println("In overloaded constructor: no of branches are: " +i);
}

public static void main (String args[]){
Bank b= new Bank();		 
Bank b1= new Bank(100);
}

}