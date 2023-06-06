package ztugas_4;

//import java.util.*;

public class ZTugas_4 {

    // 23/10/22
    // 4. Write a pseudocode to find 
    // the average of the elements in the following array. 
    // (3,4,5,6,7)
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 6, 7};
        
        System.out.println(average (arr));
        
    }
    private static int average (int [] arr){
        int total = 0;
        for(int i = 0 ; i < 5 ; i++){
            total += arr[i];
        }
        total /= 5;
        return total;
    }
    
    
    
    
    
    
    
}
