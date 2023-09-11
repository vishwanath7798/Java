package TWO_D_ARRAY;
import java.util.*;
public class Spirlal_matrix {
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
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=m-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol; i<=endCol; i++){
                System.out.print(arr[startRow][i]+" ");
            }
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }
            for(int i=endCol-1; i>=startCol; i--){
                System.out.print(arr[endRow][i]+" ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        sc.close();
    }
}
