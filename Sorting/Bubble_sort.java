package Sorting;
import java.util.Scanner;
public class Bubble_sort {
    public static void bubbleSort(int arr[]){
        int swaps=0;
        for(int i=0; i<arr.length; i++){
            swaps=0;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            System.out.println(swaps);
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        printArr(arr);
        sc.close();
    }
}
