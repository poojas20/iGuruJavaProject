class LoginAction{
void login(String userid, String pwd){
System.out.println("Login using userid and pwd");
}

void login(String userid, long mobileno, int otp){
System.out.println("Login using userid,mobile and otp");
}

void login(String userid, String rsatoken, int pin){
System.out.println("Login using userid, rsatoken and pin");
}

public static void main(String[] args){
LoginAction I=new LoginAction();
I.login("uid","password");
I.login("uid",99292929,1234);
I.login("uid","rsatoken",1234);

}
}