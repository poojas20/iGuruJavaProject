public class CheckingAccount
{
 public double balance;
 private int number;
 public CheckingAccount(int number1)
  {
   number=number1;
  }

public void m1(){
try{
int i=10/0;
}
catch(Exception e){
	System.out.println("Exception thrown in m1 method :" +e);
	e.printStackTrace();
	}
}


 /* public void deposit(double amount)
  {
	try{
	balance= balance+amount;
	System.out.println("in deposit method: "+balance);
	throw new OTPException();//assuming user has entered invalid OTP
	}
catch(OTPException e){
System.out.println("OTP Exception thrown in deposit method:" +e);
e.printStackTrace();
}  

}*/

public void deposit(double amount) throws OTPException
{
	balance= balance+amount;
	System.out.println("balance in deposit method: "+balance);
	throw new OTPException();
	}

  public void withdraw(double amount) throws InsufficientFundsException
   {
     if(amount<=balance)
	{
	 balance-=amount;
	 System.out.println("in withdraw method if block: "+balance);
	 }
	else
	 {
	  System.out.println("in withdraw method else block: "+balance);
	  double needs= amount-balance;
	  throw new InsufficientFundsException(needs);
	}
}
}