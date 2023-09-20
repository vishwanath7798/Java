package Strings;
import java.util.*;
public class Check_if_a_String_is_Palindrome {
    public static boolean isPalindrom(String str){
        int n=str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isPalindrom(str));
        sc.close();
    }
}
