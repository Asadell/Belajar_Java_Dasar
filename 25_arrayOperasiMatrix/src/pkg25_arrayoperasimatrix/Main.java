package pkg25_arrayoperasimatrix;



public class Main {

    
    
    public static void main(String[] args) {
        // array membentuk operasi matrix
        
        int[][] array1 ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        int[][] array2 = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        
        printArray (array1);
        printArray (array2);
        
        
        int[][] hasilJumlah = sum(array1, array2);
        printArray (hasilJumlah);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    private static int [][] sum (int[][] matrix1, int[][]matrix2){
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;
        
        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;
        
        int [][] hasil = new int [baris1][kolom2];
        
        if(baris1 == baris2 && kolom1 == kolom2){
            for(int i = 0; i < baris1; i++){
                for (int j = 0; j < kolom2; j++){
                    hasil [i][j]= matrix1[i][j] + matrix2[i][j];
                }
            }
        }else{
            System.out.println("jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }
    
    private static void printArray (int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        for(int i = 0; i < baris; i++){
            System.out.print("[ ");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);
                
                if(j < (kolom - 1)){
                    System.out.print(", ");
                }else{
                    System.out.println(" ]");
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
