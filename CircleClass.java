import java.io.*;
public class CircleClass{
	public static void main(String args[]){
		circle c = new circle();
		System.out.println("cercumfrence is"+c.circum(5.0));
	}
}
class circle{
	double x,y;
	double r;
	double circum(double r){
		return 2*3.14159*r;
	}
}
