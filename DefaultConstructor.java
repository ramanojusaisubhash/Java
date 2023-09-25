class Rectangle{
    int a;
    int l=10,b=3;
    Rectangle(){
         a=l*b;
    }
}
public class DefaultConstructor{
    public static void main(String args[]){
        Rectangle R = new Rectangle();
        System.out.println("Area of the rectangle is :"+R.a);
    }
}
