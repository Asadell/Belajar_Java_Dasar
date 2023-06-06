package pkg21_latoperasipadaarray;

import java.util.Arrays;

public class Main {

    
    public static void main(String[] args) {
        // operasi pada array
        
        int arrayAngka1 [] = {1, 2, 3, 4, 5, }; //declare dan assigment
        
        // merubah array to string
        System.out.println("mengubah array menjadi string\n===================");
        System.out.println(Arrays.toString(arrayAngka1)); // cara 1
        printArray (arrayAngka1); // cara 2
        
        // mengkopi array
        System.out.println("\nmengkopi array\n===================");
        int [] arrayAngka2 = new int[5];
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        // mengkopi dengan loop 'for'
        System.out.println("\nmengkopi dengan for\n===================");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i]=arrayAngka1[i];
        } //kalo awalnya 1, 1 jadi mengikuti 2
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        System.out.println("\nmengkopi dengan .copyOf\n===================");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nmengkopi dengan .copyOfRange\n===================");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        System.out.println("\nfill array\n===================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,6);
        printArray(arrayAngka5);
        
        System.out.println("\nkomparasi array\n===================");
        int[] arrayAngka6 = {1, 2, 3, 4, 5};
        int[] arrayAngka7 = {1, 2, 3, 4, 5};
        
        if(arrayAngka6 == arrayAngka7){
            System.out.println("array sama");
        }else{
            System.out.println("array tidak sama");
        }
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("  array sama");
        }else{
            System.out.println("  array tidak sama");
        }
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7)); //berupa boolean
        System.out.println("~cari perbedannya~");
        
        System.out.print("\n mengecek mana array yg lebih besar- ");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
        
        System.out.print("\n mengecek mana array yg berbeda- ");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
        
        System.out.println("\nsort array\n===================");
        int [] arrayAngka8 = {1, 2, 3, 4, 5};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        System.out.println("\nsearch array\n===================");
        int angka = 2;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);
        
        
    }
    private static void printArray (int [] dataArray){
        System.out.println("array ke- " + Arrays.toString(dataArray));
    } 
    
}
