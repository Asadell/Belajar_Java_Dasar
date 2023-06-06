
package pkg23_arraymultidimensi;

import java.util.Arrays;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array multidimensi eps 1
        
        int [] array_1_Dimensi = {1,2,3,4,5};
        print1D (array_1_Dimensi);
        
        System.out.println("");
        int [][] array_2_Dimensi = {
            {4,3,1},
            {7,3,9}
        };
        print2D (array_2_Dimensi);
        
        System.out.println("");
        // int [baris] [kolom]
        int[][] arrayAngka1 = new int [5][4];
        print2D (arrayAngka1);
        
        System.out.println("");
        looping1(arrayAngka1);
        
        
        
    }
    
    private static void looping1 (int[][] dataArray){
        for(int i = 0 ; i < dataArray.length ; i++){
            System.out.print("[");
            for(int j = 0 ; j < dataArray[i].length ; j++){
                System.out.print(dataArray [i][j] + " ,");
            }
            System.out.print("]\n");
        }
    }
    
    private static void print1D (int[] dataArray){
        System.out.println(Arrays.toString(dataArray));
    }
    
    private static void print2D (int[][] dataArray){
        System.out.println(Arrays.deepToString(dataArray));
    }
    
    
}
