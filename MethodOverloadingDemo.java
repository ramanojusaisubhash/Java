class Addition{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class MethodOverloadingDemo{
    public static void main(String args[]){
        Addition A = new Addition();
         float x = Float.parseFloat(args[0]);
         float y = Float.parseFloat(args[1]);
        System.out.println("Sum of "+x+" and "+y+" is "+A.add(x,y));
    }
}
