import java.util.*;
public class PrimeNumber_V4{
    public static void main(String args[]) {
        int flag=0,i,j,num;
        System.out.print("Enter an integer to check prime or not: ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("The list of prime numbers from 2 to "+num+" are:");
        for(i = 2; i <= num; i++){
            flag=0;
             for( j = 2; j <=i/2; j++){
                 if(i % j == 0)
                 {
                     flag = 1;
                     break;
                 }
             }
             if(flag == 0)
             {
                 System.out.print(i+" ");
             }
         }
    }
}
