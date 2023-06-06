package ztugas_8;

import java.util.*;

public class ZTugas_8 {
    
    // 23/10/22
    // 8. Write a pseudocode to print all the numbers
    // greater than the average of the numbers
    // given in an array of size 10.
    public static void main(String[] args) {
        // punya tugas 7
        Scanner input = new Scanner (System.in);
        
        int [] arr =new int [10];
        
        //inputUser==========
        System.out.println("enter index array = "); 
        for (int i = 0 ; i < 10 ; i++){
            arr [i] = input.nextInt();
        }
        greater (arr);
    }
    private static void greater (int [] arr){
        //calculate average
        int average = 0;
        for (int j = 0 ; j < 10 ; j++){
            average += arr [j];
        }
        
        System.out.println("the average is " + (average /= 10));
        
        System.out.print("the number that is greater than the average is = ");
        for (int k = 0; k < 10 ; k++){
            if (arr [k] > average){
                System.out.print(arr [k] + ", ");
            }
        }
        
    }
    
    
    
    
    
    
    
    
}
