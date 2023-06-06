
package pkg8_calculatorswitchcase;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float a, b, x;
        String operator;
        
        System.out.print("masukkan nilai a : ");
        a = input.nextFloat();
        System.out.print("masukkan operator : ");
        operator = input.next();
        System.out.print("masukkan nilai b : ");
        b = input.nextFloat();
        
        switch(operator){
            case "+":
                //pertambahan
                x = a + b;
                System.out.println("hasil dari "+ a + " " + operator + " "+b+" adalah.. " + x);
                break;
            case "-":
                //pengurangan
                x = a - b;
                System.out.println("hasil dari "+ a + " " + operator + " "+b+" adalah.. " + x);
                break;
            case "*":
                //perkalian
                x = a * b;
                System.out.println("hasil dari "+ a + " " + operator + " "+b+" adalah.. " + x);
                break;
            case "/":
                //pembagian
                x = a / b;
                System.out.println("hasil dari "+ a + " " + operator + " "+b+" adalah.. " + x);
                break;
            default:
                System.out.println("operator tidak valid");
            
        }
        
        
        System.out.println("\nberes\n");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
