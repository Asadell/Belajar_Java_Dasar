package pkg12_latloopingsederhana;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int nilaiAwal, nilaiAkhir, total;
        
        System.out.print("masukkan nilai awal : ");
        nilaiAwal = input.nextInt();
        System.out.print("masuukan nilai akhir : ");
        nilaiAkhir = input.nextInt();
        
        //while
        total = 0;
        while (nilaiAwal <= nilaiAkhir){
            total += nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        System.out.println("\n======\n");
        
        //do while (ga ngerti)
        
        
        
        
        
        
        
        
        //for (gagal)
        // for (total = 0;nilaiAwal = nilaiAkhir; nilaiAwal++){
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
