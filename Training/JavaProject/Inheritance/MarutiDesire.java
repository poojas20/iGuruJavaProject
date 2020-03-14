class MarutiSwift{

String name="Swift";
void engine(){
System.out.println("In Swifts engine method");
}
}

class MarutiDesire extends MarutiSwift{
String name= "Swift Desire";

@Override
void engine(){

super.engine();
System.out.println(super.name);
System.out.println("In Swift Desire engine method");
}

void acceleration(){
System.out.println("In acceleration method");
}


public static void main(String args[]){

MarutiDesire s= new MarutiDesire();
s.engine();
System.out.println(s.name);
s.acceleration();
}
}

class MarutiDZ extends MarutiDesire{
String name= "Swift DZ";

public static void main(String args[]){
MarutiDZ s = new MarutiDZ();
s.engine();
System.out.println("In SwiftDZ  " +s.name);
}
}