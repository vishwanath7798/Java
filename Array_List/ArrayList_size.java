package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_size {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        // System.out.print(list);
        System.out.print(list.size());
    }
}
