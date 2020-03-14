class Multiplication{
int a=10;
int b=5;
int z=a*b;


void multi(){
int a=10;
int b=5;
int z=a*b;
System.out.println("mutiplication is:" +z);
}

void multi1(int a, int b){
int y=a*b;
System.out.println("mutiplication1 is:" +y);
}

int multi2(int d, int e){
int g=d*e;
System.out.println("mutiplication2 is "+g);
return 0;
}


public static void main(String args[]){
Multiplication m=new Multiplication();
m.multi();
m.multi1(20,5);
m.multi2(30,5);

}
}