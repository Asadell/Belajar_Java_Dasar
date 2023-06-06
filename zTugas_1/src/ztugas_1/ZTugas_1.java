package ztugas_1;

import java.util.*;

public class ZTugas_1 {
    
    // 23/10/22
    // tugas pseudocode pa ivan dl tanggal 21/10/22
    // 1. Write a pseudocode to find the 
    //largest number from the following array:(2.8.4.3.7)
    public static void main(String[] args) {
        
        int [] arr = {2, 8, 4, 3, 7};
        
        display (arr);
        
//        int n, max;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array:");
//        n = s.nextInt();
//        
//        int a[] = new int[n];
//        System.out.println("Enter the elements of array:");
//        for(int i = 0; i < n; i++){
//            a[i] = s.nextInt();
//        }
//        max = a[0];
//        
//        for(int i = 0; i < n; i++){
//            if(max < a[i]){
//                max = a[i];
//            }
//        }       
//        System.out.println("Maximum value in the array is:"+max);
        
    }
    private static void display (int[] dataArray){
        int target = dataArray[0] ;
        
        for(int i = 0; i < 5; i++){
            if(target < dataArray[i]){
                target = dataArray[i];
            }
        }
        
        System.out.println("the largest number is " + target);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
