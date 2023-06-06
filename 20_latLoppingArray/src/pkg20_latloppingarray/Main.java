
package pkg20_latloppingarray;

import java.util.Arrays;

public class Main {

    
    public static void main(String[] args) {
        // LATIHAN LOOPING DENGAN ARRAY
        
        //declare looping
        int arrayKe[] = {11, 12, 13, 14 ,15 ,16 ,17 ,18 ,19, 20};
        
        // Looping sederhana dengan 'for'
        System.out.println("Looping sederhana dengan 'for'");
        for(int i = 0; i < 10; i++){
            System.out.println("index ke-" + i + " adalah " + arrayKe[i]);
        }
        System.out.println("");
        
        
        //looping dengan property
        System.out.println("looping dengan property");
        for(int i = 0; i < arrayKe.length; i++){
            System.out.println("  index ke-" + i + " adalah " + arrayKe[i]);
        }
        System.out.println("");
        
        
        //looping khusus untuk collection
        System.out.println("display with collection");
        for(int angka : arrayKe){
            System.out.println(" "+angka);
        }
        
        
        
        
        
        
        
        
    }
    
}
