package com.tutorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int [] arr = {0,1,2,3};

        System.out.print("index ke : ");
        int indexInput = userInput.nextInt();

        System.out.println("exception biasa");
        try{
            System.out.printf("index ke-%d adalah %d\n\n", indexInput, arr[indexInput]);
        }catch (Exception e){
            System.out.println(e);
        }

        // Exception dalam fungsi
        System.out.println("\nexception dalam fungsi");
        int data = ambilData(arr,indexInput);
        System.out.printf("index ke-%d adalah %d\n\n", indexInput, data);

        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData2(arr,indexInput);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.printf("index ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("\nakhir program");
    }

    private static int ambilData2( int [] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
    private static int ambilData ( int [] array, int index){
        int data = 0;
        try{
            data = array[index];
        }catch (Exception e){
            System.out.println(e);
        }
        return data;

    }
}
