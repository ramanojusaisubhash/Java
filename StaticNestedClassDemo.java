import java.io.*;
class OuterClass{//StaticNestedClassDemo
	static int outer_x=10;
	int outer_y = 20;
	private static int outer_z = 30;
	static class StaticNestedClass{
		void display(){
			System.out.println("outer_x value is "+outer_x);
			System.out.println("outer_z value is "+outer_z);
			OuterClass oc = new OuterClass();
			System.out.println("outer_y value is "+oc.outer_y);
		}
	}
	public static void main(String args[]){
		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.display();
	}
}
