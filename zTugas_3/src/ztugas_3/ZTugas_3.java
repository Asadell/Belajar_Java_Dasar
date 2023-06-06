package ztugas_3;

import java.util.*;

public class ZTugas_3 {

    // 23/10/22
    // 3. Write a pseudocode to count the duplicate
    // values in an array of size 10.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[] arr = new int[10];
        
        System.out.println("enter 10 index ");
        // input user untuk indexnya
        for (int i = 0 ; i < 10 ; i++){
            arr[i] = input.nextInt();
        }
        
        display (arr);
        
        
        
        
        //batasss =================================================
        //punya orang dari gugel
//        int Size, i, j, dup_count = 0;
//		
//		sc = new Scanner(System.in);
//		
//		System.out.print("\nPlease Enter the Duplicate Array size  : ");
//		Size = sc.nextInt();
//		
//		int[] Dup_Count_arr = new int[Size];
//		
//		System.out.format("\nEnter Duplicate Array %d elements : ", Size);
//		for(i = 0; i < Size; i++) 
//		{
//			Dup_Count_arr[i] = sc.nextInt();
//		}
//		
//		for(i = 0; i < Size; i++) 
//		{
//			for(j = i + 1; j < Size; j++)
//			{
//				if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
//					dup_count++;
//					break;
//				}
//			}
//		}
//		System.out.println("\nThe Total Number of Duplicates  = " + dup_count);
        
        
        
    }
    private static void display (int [] dataArray){
        int count = 0;
        for ( int i = 0 ; i < 10 ; i++){
            for (int j = i+1; j < 10 ; j++){
                if (dataArray [i] == dataArray[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("the total number of duplicates " + count);
    }
    
    
    
    
    
    
    
    
}
