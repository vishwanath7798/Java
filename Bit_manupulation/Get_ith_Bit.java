package Bit_manupulation;
import java.util.Scanner;
public class Get_ith_Bit {
    public static int getIthBit(int n,int i){
        int bitMask= 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(getIthBit(n,i));
        sc.close();
    }
}
