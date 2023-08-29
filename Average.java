import java.io.*;
import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float s3=sc.nextFloat();
        float total=s1+s2+s3;
        float avg=total/3;
        System.out.println("Total marks : "+total);
        if(avg>=75)
        {
            System.out.println("Student average id "+avg+" student passed with distinstion");
        }
        else if(avg>=60 && avg<75)
        {
            System.out.println("Student average is "+avg+" student passed in first clsas");
        }
        else
        {
            System.out.println("Student failed!");
        }
    }
}