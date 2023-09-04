public class PrimeNumber_V3{
    public static void main(String args[]) {
        int flag=0,i,num;
        System.out.println("Enter an integer to check prime or not: ");
        num=Integer.parseInt(args[0]);
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
