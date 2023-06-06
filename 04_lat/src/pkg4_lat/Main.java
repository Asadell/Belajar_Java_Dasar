package pkg4_lat;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        byte a, b;
        
        System.out.print("masukkan nilai a : ");
        a = input.nextByte();
        
        System.out.print("masukkan nilai b : ");
        b = input.nextByte();
        
        if( a > 0){
            System.out.println( a + " adalah bilangan positif");
            if( a > b){
                System.out.println(a + " lebih besar dari " + b);
                if(b > 0){
                    System.out.println(b + " adalah bilangan positif");
                }else{
                    System.out.println(b + " adalah bilagan negatif");
                }
            }else{
                System.out.println("berarti a < b");
                
            }
        }else{
            System.out.println(a + " adalah bilangan negatif");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
