package pkg3_latinput;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String nama, alamat;
        int umur;
        
        System.out.print("Nama anda : ");
        nama = input.nextLine();
        
        System.out.print("Alamat anda : ");
        alamat = input.nextLine ();
        
        System.out.print("Umur anda : ");
        umur = input.nextInt();
        
        System.out.println("nama saya adalah " + nama + " dan beralamat di " + alamat);
        System.out.println("Berumur " + umur + " th.");
    }
    
}
