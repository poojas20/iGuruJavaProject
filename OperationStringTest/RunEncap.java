public class RunEncap{

public static void main(String args[]){
	EncapTest e1=new EncapTest();
	e1.setId("12343ms");
	e1.setName("James");
	e1.setAge(20);

	e1.setLastName("mr senthil kumarj");

		System.out.println("Name:" +e1.getName());
		System.out.println("Age: "+e1.getAge());
		System.out.println("id is: "+e1.getId());
		System.out.println("last Name is " +e1.getLastName());

	EncapTest e2=new EncapTest();

	e2.setName("Amit");
	e2.setAge(20);
	e2.setId("1001");

	e2.setLastName("Kumar");

		System.out.println("Name: "+e2.getName());
		System.out.println("Age: "+e2.getAge());
		System.out.println("id is: "+e2.getId());
		System.out.println("last Name is " +e2.getLastName());

}
} 