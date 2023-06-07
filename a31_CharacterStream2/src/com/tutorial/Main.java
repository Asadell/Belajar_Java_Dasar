package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //membuka
        //byte stream = FileInputStream
        //character stream = FileReader

        FileInputStream byteInput = new FileInputStream("input.txt");
        FileReader charInput = new FileReader("input.txt");

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        FileWriter       charOutput = new FileWriter("output2.txt");


        //membaca

        //byte
        int buffer = byteInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            byteOutput.write(buffer);
            buffer = byteInput.read();
        }
        System.out.println("\n\n");
        //char
        buffer = charInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            charOutput.write(buffer);
            buffer = charInput.read();
        }

        //menutup
        byteInput.close();
        charInput.close();

        byteOutput.close();
        charOutput.close();
    }
}
