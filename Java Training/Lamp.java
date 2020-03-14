class Lamp{
boolean isOn;

void turnOn()
{
isOn=true;
}

void turnOff()
{
isOn=false;
}

void displayStatus(){
System.out.println("Is light on=" +isOn);
}

public static void main(String[] args){
Lamp l1=new Lamp(); 
Lamp l2=new Lamp(); 

l1.turnOn();
l2.turnOff();

l1.displayStatus();
l2.displayStatus();

}

}
