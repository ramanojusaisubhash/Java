import java.util.*;
public class MatixMultiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows  matrix's :");
        int r=sc.nextInt();
        System.out.print("Enter no of coloums  matrix's :"); 
        int c=sc.nextInt();
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];
        System.out.println("Enter "+r*c+" elements of matrix-1 .");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter "+r*c+" elements of matrix-2 .");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < r; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        System.out.println("Multiplication of matrix 1, 2 is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
