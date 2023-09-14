import java.io.*;
class A{
    void m(){
        System.out.println("Inside method m.");
    }
    void n(){
        System.out.println("inside method n");
        this.m();
    }
}
public class ThisMethodDemo{
    public static void main(String args[]){
        A a = new A();
        a.n();
    }
}
