package pkg18_fungsirekursif;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner (System.in);
        
        System.out.print("masukkan nilai : ");
        int nilai = input.nextInt();        
        
        printAngka(nilai);
        System.out.println("");
        
        printNilai(nilai);
        System.out.println("");
        
        hitungFaktorial (nilai);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial : " +faktorial);
    }
    
//    batas main utama========================================================
    
    private static void printAngka (int angka){
        if(angka == 0){
            return;
        }
        System.out.println("angka ke : " + angka);  
        angka --;
        printAngka(angka);
        
    }
    
    private static int printNilai (int nilai){
        
        System.out.println("  nilai = " + nilai);
        
        if(nilai == 0){
            return nilai;
        }
        
        return nilai + printNilai(nilai - 1);
        
    }
    
    
    private static int hitungFaktorial (int faktorial){
        System.out.println("    nilai faktorial : " + faktorial);
        
        if(faktorial == 1){
            return faktorial;
        }
        
        return faktorial * hitungFaktorial (faktorial - 1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
