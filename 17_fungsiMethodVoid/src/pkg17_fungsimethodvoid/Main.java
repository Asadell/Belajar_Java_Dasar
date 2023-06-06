package pkg17_fungsimethodvoid;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        selamatPagi ("asadel");
        selamatPagi ("Satrio\n");
        
        fungsiVoid ("haii\n");
        
        System.out.println(simpel() + "\n");
        
        
    }
    
    private static void selamatPagi(String nama){
        System.out.println("Selamat pagii " + nama);
    }
    
    private static void fungsiVoid (String input){
        System.out.println(input);
    }
    
    private static float simpel(){
        return 10.0f;
    }
    
}
