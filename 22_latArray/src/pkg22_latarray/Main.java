
package pkg22_latarray;

import java.util.Arrays;

public class Main {

    
    public static void main(String[] args) {
        // latihan array
        
        int [] arrayAngka1 = {1, 12, 7, 4, 5, 6, 7, 45, 9, 11};
        int []arrayAngka2 = {0, 9, 16, 7, 36, 25, 14, 3, 2, 1};
        
        //penjumlahan array
        int[] arrayHasil = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1, "index pertama " );
        printArray(arrayAngka2, "array 2 ");
        printArray(arrayHasil , "array hasil");
        
        System.out.println("");
        
        //meggabungkan 2 
        int [] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for(int i=0 ; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }
        for(int i = 0 ; i < arrayAngka2.length; i++){
            arrayHasil2 [i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "index pertama " );
        printArray(arrayAngka2, "array 2 ");
        printArray(arrayHasil2 , "array hasil2");
        
        System.out.println("");
        
        
        printArray(arrayAngka1, "array1");
        reverse(arrayAngka1);
        printArray(arrayAngka1,"reverse array1");
        System.out.println("");
        printArray(arrayAngka2, "array2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2,"reverse array2");
        
    }
    private static void reverse2 (int [] dataArray){//sort 2 lebih cepet
        Arrays.sort(dataArray);
        int buffer;
        for(int i = 0; i < dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }
    
    private static void reverse(int [] dataArray){ //sort cara 1 (borosssssss)
        Arrays.sort(dataArray); //sort dulu
        //reverse
        int[] arrayBuffer = Arrays.copyOf(dataArray,dataArray.length);
        for(int i = 0 ; i < dataArray.length ; i++){
            dataArray[i] = arrayBuffer [(arrayBuffer.length - 1 ) - i ];
        }
    }
    
    private static int[] tambahArray (int[] array1,int[]array2){
        int[] arrayHasil = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            arrayHasil[i] = array1[i] + array2[i];
        }
        return arrayHasil;
    }
    
    private static void printArray (int[] dataArray, String message){
            System.out.println(message + " = " + Arrays.toString(dataArray));
    }
    
}
