class Account{
int a;
int b;

void setData(int a, int b){
this.a=a;
this.b=b;
}

void showData(){
System.out.println("value of A= " +a);
System.out.println("value of B= " +b);
}

public static void main(String args[]){

Account obj= new Account();
obj.setData(2,3);
obj.showData();
}

}

