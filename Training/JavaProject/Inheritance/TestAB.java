class TestAB{
	public static void main(String[] args){
		System.out.println("====Scenario1===");
		A obj1=new A();

		System.out.println(obj1.a);
		System.out.println(obj1.b);
		//System.out.println(obj1.c);		

		obj1.m1();
		obj1.m2();
		//obj1.m3();

System.out.println("====Scenario2===");
		B obj2=new B();

		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);		

		obj2.m1();
		obj2.m2();
		obj2.m3();

System.out.println("====Scenario3===");
		A obj3=new B();

		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);		

		obj3.m1();
		obj3.m2();
		obj3.m3();
}
}

//A obj=new B() for variable it chek what the reference type 
//and for methods it check what the object type is(right side)




