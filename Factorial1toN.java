import java.io.*;
import java.util.*;
public class Factorial1toN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value(1-12):");
		double n=sc.nextDouble();
		double fact=1;
		for(double i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of "+i+" is: "+fact);
		}
	}
}