import java.util.*;
class Max_and_min{
    public static int Maxmin (int arr[], int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("largest value in array is "+max);
        return min;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int min=Maxmin(arr,n);
        System.out.println("smallest value in array is "+min);
        sc.close();
    }
}