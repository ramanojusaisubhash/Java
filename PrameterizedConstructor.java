class Rectangle{
    int a;
    Rectangle(int l,int b){
         a=l*b;
    }
}
public class PrameterizedConstructor{
    public static void main(String args[]){
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        Rectangle R = new Rectangle(x,y);
        System.out.println("Area of the rectangle is :"+R.a);
    }
}
