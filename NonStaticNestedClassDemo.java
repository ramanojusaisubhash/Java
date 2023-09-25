 import java.io.*;
class OuterClass{
    static int outer_x=10;
	int outer_y = 20;
	private  int outer_z = 30;
	class InnerClass{
		void display(){
			System.out.println("outer_x value is "+outer_x);
			System.out.println("outer_z value is "+outer_z);
			OuterClass oc = new OuterClass();
			System.out.println("outer_y value is "+oc.outer_y);
		}
	}
}
public class NonStaticNestedClassDemo{
	public static void main(String args[]){
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.display();
	}
}
