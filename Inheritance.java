class Animal{
    String name;
    public void Eat(){
        System.out.println("I can Eat");
    }
}
class JerryMouse extends Animal{
    public void Display(){
        System.out.println("My name is "+name);
    }
}
public class Inheritance{
    public static void main(String args[]){
        JerryMouse JM = new JerryMouse();
        JM.name="Jerry-The Mouse";
        JM.Display();
        JM.Eat();
    }
}
