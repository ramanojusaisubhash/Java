public class ArrayDemo2{//using for each
    public static void main(String args[]){
        int arr[]= new int[6];
        arr[0]=00;
        arr[1]=11;
        arr[2]=22;
        arr[3]=33;
        arr[4]=44;
        arr[5]=55;
        for(int i : arr){//for(int i=0;i<arr.length;i++)
            System.out.print(i+" ");
        }
    }
}
