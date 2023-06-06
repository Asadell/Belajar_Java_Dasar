package pkg27_exception;


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    /**
     * 02/02/2023
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        int [] arr = {0,1,2,3,4}; 
        
        System.out.print("index ke : ");
        int index = userInput.nextInt();
        
        try{
            System.out.printf("index ke-%d, adalah %d\n",index,arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        
        System.out.println("file");
        FileInputStream fileInput = null;
        try{
            fileInput = new FileInputStream("input.txt");
        }catch (IOException e){
            System.err.println(e);
        }
        
        
        System.out.println("\ngabungan\n");
        try{
            System.out.printf("index ke-%d, adalah %d\n\n",index,arr[index]);
            fileInput = new FileInputStream("input.txt");
        }catch (Exception e){
            System.err.println(e);
        }
        
        System.out.println("\ngabungan pisah catch");
        try {
            System.out.printf("index ke-%d, adalah %d\n\n",index,arr[index]);
            fileInput = new FileInputStream("input.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }catch (IOException e){
            System.err.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int [] array = {0,1,2,3};
//        
//        Scanner userInput = new Scanner (System.in);
//        System.out.print("nilai array ke: ");
//        int index = userInput.nextInt();
//        
//        System.out.println("index");
//        try{
//            System.out.printf("index ke-%d adalah %d\n",index,array[index]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println(e);
//        }
//        System.out.println("");
//        
//        System.out.println("file");
//        FileInputStream fileInput = null;
//        try{
//            fileInput = new FileInputStream("input.txt");
//        }catch (IOException e){
//            System.err.println(e);
//        }
//        
//        
//        System.out.println("\n\ngabungan");
//        try{
//            System.out.printf("index ke-%d adalah %d\n",index,array[index]);
//            fileInput = new FileInputStream("input.txt");
//        }catch (Exception e){
//            System.err.println(e);
//        }
//        System.out.println("");
//        
//        System.out.println("gabungan catch pisah");
//        try{
//            System.out.printf("index ke-%d adalah %d\n",index,array[index]);
//            fileInput = new FileInputStream("input.txt");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("index salah");
//        }catch (IOException e){
//            System.out.println("file null");
//        }
//        System.out.println("");
//        
//        System.out.println("fffffinally");
//        try{
//            System.out.printf("index ke-%d adalah %d\n",index,array[index]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.err.println("index salahhhh");
//        }finally{
//            System.out.println("finally");
//        }
        
        
        
        
        
        
        
    }
    
}
