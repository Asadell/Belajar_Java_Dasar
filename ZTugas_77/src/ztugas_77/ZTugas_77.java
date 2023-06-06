package ztugas_77;

import java.util.*;

public class ZTugas_77 {

    // 23/10/22
    // 7. Write a pseudocode to concatenate two arrays
    // containing elements in ascending order to create
    // a new array containing elements in ascending order.
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        
        System.out.print("enter size arr 1 = ");
        int size1 = input.nextInt();
        
        int [] arr1 = new int [size1];
        System.out.println("with size " + size1 + " enter index arr 1 = ");
        for (int i = 0 ; i < size1; i++){
            arr1 [i] = input.nextInt ();
        } 
        
        System.out.print("enter size arr 2 = ");
        int size2 = input.nextInt();
        
        int [] arr2 = new int [size2];
        System.out.println("with size " + size2 + " enter indexnya arr 2 = ");
        for (int j = 0 ; j < size2; j++){
            arr2 [j] = input.nextInt ();
        } 
        //mulai concatenate
        int [] arr3 = new int [size1 + size2];
        
        for (int k = 0 ; k < size1 ; k++){ 
            arr3 [k] = arr1[k];
        }
        for (int l = 0 ; l < size2 ; l++){
            arr3 [size1 + l] = arr2[l];
        }
        System.out.println("result "); //result=================================
        for(int m = 0 ; m < (size1 + size2) ; m++){
            System.out.print(arr3 [m] + ",  ");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
