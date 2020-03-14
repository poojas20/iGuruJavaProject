class School{
int count=30;
String addr="Pune";

void addmission()
{
System.out.println("Addmission done");
}

void address()
{
System.out.println("addreess is Pune");
}
public static void main(String[] args)
{
School d=new School();
d.addmission();
d.address();
System.out.println("class intake is:"+d.count);
System.out.println("school located in:"+d.addr);
}
}