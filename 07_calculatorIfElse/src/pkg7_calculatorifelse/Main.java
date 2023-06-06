
package pkg7_calculatorifelse;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float x, a, b;
        char operator;
        
        System.out.print("masukkan nilai a: ");
        a = input.nextFloat();
        
        System.out.print("masukkan operator: ");
        operator = input.next().charAt(0);
        
        System.out.print("masukkan nilai b: ");
        b = input.nextFloat();
        
        System.out.println("\nperhitungan " + a + " " + operator + " " + b + "\n");
        
        
        
        if( operator == '+'){
            //pertambahan
            x = a + b;
            System.out.println("hasil "+ a + " " + operator+" " + b + " : " + x);
        }else if ( operator == '-'){
            //pengurangan
            x = a - b;
            System.out.println("hasil "+ a + " " + operator+" " + b + " : " + x);
        }else if (operator =='*'){
            //perkalian
            x = a * b;
            System.out.println("hasil "+ a + " " + operator+" " + b + " : " + x);
        }else if (operator == '/'){
            //pembagian
            if(b == 0){
                System.out.println("hasil "+ a + " " + operator+" " + b + " :  tak hingga");
            }else{
            x = a/b;
            System.out.println("hasil "+ a + " " + operator+" " + b + " : " + x);
            }
        }else{
            System.out.println("operator tidak valid");
        }
        
        System.out.println("\n\nberes");
    }
    
}
