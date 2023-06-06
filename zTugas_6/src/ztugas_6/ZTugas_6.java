package ztugas_6;

import java.util.*;

public class ZTugas_6 {

    // 23/10/22
    // 6. Write a pseudocode to display the following matrix.
    // 11,  15,  12,  6
    // 9,   32.  12,  34
    // 23,  54,  78,  9
    // 8,   7,   5,   3
    public static void main(String[] args) {
        int arr [][] = {
            {11, 15, 12, 6},
            {9, 32, 12, 34}, 
            {23, 54, 78, 9},
            {8, 7, 5, 3}
        };
        display(arr);
    }
    private static void display (int[][] arr){
        for ( int i = 0 ; i < 4 ; i++){
            for ( int j = 0 ; j < 4 ; j++){
                System.out.print(arr [i] [j] + "\t");
            }
            System.out.println("");
        }
    }
    
    
    
    
    
    
}
