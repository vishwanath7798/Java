package TWO_D_ARRAY;
import java.util.Scanner;
public class Diagonal_sum {
    public static int sumOfDiagonal(int arr[][],int n, int m){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i][i];
            if(i!=n-i-1){
            sum+=arr[i][n-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(sumOfDiagonal(arr,n,m));
        sc.close();
    }
}
