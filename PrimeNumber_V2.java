import java.util.*;
public class PrimeNumber_V2{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int flag=0,i;
        System.out.print("Enter an integer to check prime or not : ");
        int num=sc.nextInt();
        for(i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number. ");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+" is a prime number.");
        }
    }
}
