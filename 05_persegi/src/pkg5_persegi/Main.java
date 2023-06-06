package pkg5_persegi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //menghitung luas dan keliling dari persegi
        Scanner input = new Scanner (System.in);
        
        int s;
        int L, K;
        
        System.out.print("Masukkan s : ");
        s = input.nextInt();
        
        L = s * s;
        K = 4 * s;
        
        System.out.println("L \t= s x s");
        System.out.println("L \t= " + s + " x " + s);
        System.out.println("L \t= " + L +" cm2\n");
        
        System.out.println("K \t= 4 x s");
        System.out.println("K \t= 4 x " + s);
        System.out.println("K \t= " + K + " cm" + "\n");
        
        
        
    }
    
}
