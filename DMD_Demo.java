class A{
    void M1(){
        System.out.println("Inside A class , method M1"); 
    }
}
class B extends A{
    void M1(){
        System.out.println("Inside B class , method M1");
    }
}
class C extends A{
    void M1(){
        System.out.println("Inside C class , method M1");
    }
}
public class DMD_Demo{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        A r;// r is a reference of A class
        r=a;
        r.M1();
        r=b;
        r.M1();
        r=c;
        r.M1();
    }
}
