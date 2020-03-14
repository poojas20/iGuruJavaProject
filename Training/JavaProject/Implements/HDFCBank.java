interface Bank{

public void credit(int depAmt);//abstract methods doesnt have a body

public void debit(int wAmt);

//public void MF();
}

interface RBI{

public void interest(int iAmt);
}

class WorldBank{

public void loan(){
System.out.println("in loan method");

}
}

class HDFCBank extends WorldBank implements Bank,RBI{
int currentBal=500;

public void debit(int wAmt){
currentBal=currentBal-wAmt;
System.out.println(currentBal);
}

public void credit(int depAmt){
currentBal=currentBal+depAmt;
System.out.println(currentBal);
}

@Override
public void interest(int iAmt){
currentBal=currentBal+ iAmt;
System.out.println(currentBal);
}

public static void main(String[] args){

HDFCBank d= new HDFCBank();
d.debit(100);
d.credit(200);
d.interest(10);
//Bank b=new Bank();
d.loan();

}
}


