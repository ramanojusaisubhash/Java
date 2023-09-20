import java.io.*;
class Bank{
    int getRateOfIntrest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfIntrest(){
        return 8;
    }
}
class HDFC extends Bank{
    int getRateOfIntrest(){
        return 9;
    }
}
class UNIONBANK extends Bank{
    int getRateOfIntrest(){
        return 10;
    }
}
public class MethodOverridingDemo{
    public static void main(String args[]){
       SBI s = new SBI();
       HDFC h =new HDFC();
       UNIONBANK u = new UNIONBANK();
       System.out.println("SBI rate of intrest is : "+s.getRateOfIntrest());
       System.out.println("HDFC rate of intrest is : "+h.getRateOfIntrest());
       System.out.println("UNIONBANK rate of intrest is : "+u.getRateOfIntrest());
    }
}
