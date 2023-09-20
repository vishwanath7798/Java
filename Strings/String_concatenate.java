package Strings;
import java.util.*;
public class String_concatenate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String result=str1+" "+str2;
        System.out.println(result);
        sc.close();
    }
}