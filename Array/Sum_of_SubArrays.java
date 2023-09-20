import java.util.Scanner;
public class Sum_of_SubArrays {
    public static void sumOfSubArray(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                sum=0;
                for(int k=start; k<=end; k++){
                    sum += arr[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sumOfSubArray(arr);
        sc.close();
    }
}
