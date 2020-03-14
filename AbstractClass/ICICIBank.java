/*abstract class Bank{
abstract public void credit(int depAmt);
abstract public void debit(int wAmt);

public void MF(){
 System.out.println("its upto the child class whether to use it or not");
}
}

class ICICIBank extends Bank{

int bal=500;

public void credit(int depAmt){
bal=bal+depAmt;
System.out.println(bal);
}

public void debit(int wAmt){
bal=bal-wAmt;
System.out.println(bal);
}

public static void main(String[] args){
ICICIBank d=new ICICIBank();
d.debit(200);
d.debit(100);
d.MF();

}
}*/