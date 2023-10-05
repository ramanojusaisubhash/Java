import java.io.*;
import java.util.*;
public class ArrayDemo2{//using for each
static int min(int a[]){
    int M=a[0];
    for(int i=0;i<a.length;i++){
        if(M>a[i])
        {
            M=a[i];
        }
    }
    return M;
}
static int max(int a[]){
    int Max =a[0];
    for(int i=0;i<a.length;i++){
        if(Max<a[i]){
            Max=a[i];
        }
    }
    return Max;
}
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are -");
        for(int i : arr){//for(int i=0;i<arr.length;i++)
            System.out.print(i+" ");
        }
        System.out.println("\nminimum elements of array = "+min(arr));
        System.out.println("minimum elements of array = "+max(arr));

    }
}
