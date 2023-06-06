package ztugas_5;

import java.util.*;

public class ZTugas_5 {
    
    // 23/10/22
    // 5. Write a pseudocode to display
    // the fifth element of an array of size 10.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // element = size
        // element ≠ index
        // element = (index + 1)
        int[] arr = new int [10];
        
        System.out.println("enter 10 index");
        for (int i = 0 ; i < 10 ; i++){
            arr[i] = input.nextInt();
        }
        display (arr);
    }
    private static void display (int [] arr){
        System.out.println("the fifth element is = " + arr[4]);
    }
    
    
    
    
    
    
    
    
    
}
