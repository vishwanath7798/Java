package Bit_manupulation;
import java.util.Scanner;
public class Check_if_number_is_even_or_odd {
    public static void isEvenOrOdd(int num){
        int bitMask=1;
        if( (num&bitMask) == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isEvenOrOdd(num);
        sc.close();
    }
}
