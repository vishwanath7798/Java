package Strings;
import java.util.*;
public class String_charAt_Method {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
        sc.close();
    }
}
