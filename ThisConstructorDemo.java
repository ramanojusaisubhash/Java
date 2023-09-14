import java.io.*;
class A{
    int y=10;
    A(){
        System.out.println("Inside default constructor");
    }
    A(int x){
        this();
        System.out.println("parameterized constructor");
        System.out.println("x value is "+x);
    }
}
public class ThisConstructorDemo{
    public static void main(String args[]){
        A a = new A(249);
    }
}
