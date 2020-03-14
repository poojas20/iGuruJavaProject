class Bank{

int currentBal=500;

public void debit(int wAmt){

currentBal=currentBal- wAmt;
System.out.println(currentBal);
}

public static void main(String args[]){
Bank b= new Bank();
b.debit(100);
}
}

class CitiBank extends Bank{
int currentBal=1000;

public void debit(int wAmt){

super.debit(300);
currentBal=currentBal- wAmt;
System.out.println(currentBal);
}

public void credit(int depAmt){
currentBal=currentBal- depAmt;
System.out.println(currentBal);
}

public static void main(String args[]){
CitiBank b= new CitiBank();
b.debit(200);
b.credit(500);

}
}

//class CitiGroup{
//public static void main(String args[]){




