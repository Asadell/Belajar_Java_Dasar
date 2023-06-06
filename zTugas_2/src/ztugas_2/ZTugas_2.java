package ztugas_2;

import java.util.*;

public class ZTugas_2 {

    // 23/10/22
    // // tugas pseudocode pa ivan dl tanggal 21/10/22
    // 2.	Write a pseudocode to print 
    // the element that occurs most frequently in a given array 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("enter the size = ");
        int a = input.nextInt();
        
        int[] arr = new int [a];
        
        System.out.println("masukkan angka arraynya = ");
        for (int i = 0 ; i < a ; i++){
            arr[i] = input.nextInt();
        }
        
        System.out.println(display (arr));
        
//        System.out.println("angka yg sering muncul adalah");
    }
  
    private static int display (int [] dataArray){
        int mf, maxCount, count;
        mf = -1;
        maxCount = 0;
        
        for ( int i = 0 ; i < dataArray.length; i++){
            count = 0;
            for (int j = i+1 ; j < dataArray.length ; j++){
                if (dataArray[i] == dataArray[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mf = dataArray[i];
            }
        }
        
        
        if( mf == -1 ){
            return -1;
        }else{
            return mf;
        }
    }
    
    
}
