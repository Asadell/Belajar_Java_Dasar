
package pkg11_forloop;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        
        System.out.println("nilai awal = 0\n");
        
        System.out.println("++ <=10");
        for (a = 0; a<=10 ; a++){
        System.out.println("for loop ke-" + a);
        }
        
        System.out.println("++ <10");
        for (a = 0; a<10 ; a++){
        System.out.println("for loop ke-" + a);
        }
        
        
        System.out.println("\n====\n");
        System.out.println("nilai awal = 20\n");
        
        System.out.println("-- >=10");
        for (a = 20; a>=10 ; a--){
        System.out.println("for loop ke-" + a);
        }
        
        System.out.println("-- >10");
        for (a = 20; a>10 ; a--){
        System.out.println("for loop ke-" + a);
        }
        
        
    }
    
}
