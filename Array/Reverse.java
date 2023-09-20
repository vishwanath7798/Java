import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n/2; i++){
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<n; i++){
            System.out.print3(arr[i]+" ");
        }
        sc.close();
    }
}
