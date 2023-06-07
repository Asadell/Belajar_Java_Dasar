package com.tutorial;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class oke {
    public static void main(String[] args) throws IOException {
        //membuka
        //byte stream = FileInputStream
        //character stream = FileReader

        FileInputStream byteInput = new FileInputStream("input.txt");
        FileReader charInput = new FileReader("input.txt");


        //membaca
        System.out.println(byteInput.read());
        System.out.println(charInput.read());

        //menutup
        byteInput.close();
        charInput.close();
    }
}
