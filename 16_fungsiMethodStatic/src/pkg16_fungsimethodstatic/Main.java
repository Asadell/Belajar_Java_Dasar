package pkg16_fungsimethodstatic;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("perhitungan y = (x + 2) * x");
        
        int x, y;
        
        x = 5;
        y = hitung(x);
        System.out.println("nilai x : " + x + ", nilai y : " + y);
        
        x = 10;
        y = hitung(x);
        System.out.println("nilai x : " + x + ", nilai y : " + y);
        
        x = 20;
        y = hitung(x);
        System.out.println("nilai x : " + x + ", nilai y : " + y);
        
    }
    private static int hitung(int input){
        int hasil;
        hasil = (input + 2) * 2;
                return hasil;
    }
    
}
