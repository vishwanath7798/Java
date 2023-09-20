package Strings;
import java.util.Scanner;
public class Shortest_Path {
     public static double shortestPath(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'W'){
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(shortestPath(str));
        sc.close();
    }
}
// WNEENESENNN
