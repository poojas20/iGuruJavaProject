class Company{
int Id;
String name;
static String CompanyName="Amdocs";


public static void main(String args[]){

Company t1=new Company();
Company t2=new Company();

System.out.println(t1.Id);
System.out.println(t2.Id);
System.out.println(Company.CompanyName);
System.out.println(t1.name);
System.out.println(t2.name);

t1.Id=1007;
t2.Id=1008;
t1.name="Pooja";
t2.name="xyz";

Company.CompanyName= "Amdocs Global";
Company.CompanyName="amdocs inc";



System.out.println(t1.Id);
System.out.println(t2.Id);
System.out.println(t1.name);
System.out.println(t2.name);
System.out.println(Company.CompanyName);

}
}