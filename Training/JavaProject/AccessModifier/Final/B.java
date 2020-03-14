class A{
final int i=10;
void m1(){
i=20;
}
}

class B extends A{
@Override
void m1(){
}
}

//cannot modify or access final class, method, value of variable