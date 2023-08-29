import java.io.*;
import java.util.*;
public class EvenorOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+"is an Even number");
		else
			System.out.print(n+" is a Odd number");
	}
}
