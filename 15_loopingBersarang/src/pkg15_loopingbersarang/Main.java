package pkg15_loopingbersarang;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("segi empat");
        for (byte x = 1 ; x <= 5 ; x++){
            for (byte y = 1 ; y <= 5 ; y++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
        System.out.println("\n\n");
        
        System.out.println("segitiga 1/4");
        for (byte x = 1 ; x <= 5 ; x++){
            for (byte y = 1; y <= 5; y++){
                System.out.print("* ");
                if(x == y){
                    break;
                }
                
            }
            System.out.println();
        }
        
        System.out.println("\n\n");
        
        System.out.println("segitiga 1/4");
        for (byte x = 1 ; x <= 5 ; x++){
            for (byte y = 1; y <= 5; y++){
                System.out.print("* ");
                
                if ((x + y) == 6){
                    break;
                }
                
            }
            System.out.println();
        }
        System.out.println("\n\n");
        
        
        
        System.out.println("segitiga 1/2");
        for (byte x = 1 ; x <= 9 ; x++){
            for (byte y = 1; y <= 5; y++){
                System.out.print("* ");
                if(x == y){
                    break;
                }else if ((x + y) == 10){
                    break;
                }
//                }else if ((x + y) == 6){
//                    break;
//                    }
                
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
