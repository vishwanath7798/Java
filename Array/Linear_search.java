import java.util.*;
public class Linear_search{
    public static int linearSearch(int arr[],int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(linearSearch(arr,k));
        sc.close();
    }
}