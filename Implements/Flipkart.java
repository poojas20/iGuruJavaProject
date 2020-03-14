/*interface cart{

public void buy();
public void sell();

}

interface Category{
public void clothing();
}

class offer{
void sale(){
System.out.println("but 2 get 1 free");
}
}

class Flipkart extends offer implements cart,Category{

@Override
public void sell(){
System.out.println("items are available to sell");
}

@Override
public void buy(){
System.out.println("you can buy any item");
}

@Override
public void clothing(){
System.out.println("clothing men and woment");
}

public static void main(String[] args){
System.out.println("in method of flipkart class");
Flipkart f=new Flipkart();
f.sell();
f.buy();
f.clothing();
offer o=new offer();
o.sale();
 
}
}
*/