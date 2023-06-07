package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        //membuka data
        fileInput = new FileInputStream ("input.txt");

        //memasukkan data
        int data = fileInput.read();
        System.out.println(data);
        System.out.println("mulai\n");

        while (data != -1){
            System.out.println((char)data);
            data = fileInput.read();
        }

        //menutup file
        fileInput.close();



        //salah satu skenario program pembukaan file
        try{
            //membuka file
            fileInput = new FileInputStream("input.txt");
            fileOutput = new FileOutputStream("output.txt");

            //membaca file
            int buffer = fileInput.read();

            while (buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        }finally {
            if (fileInput != null){
                fileInput.close();
            }
            if (fileOutput != null){
                fileInput.close();
            }
        }


        //try with resources

        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output2.txt")
                ){
            int data2 = in.read();

            while (data2 != -1){
                out.write((char)data2);
                data2 = in.read();
            }
        }




        //percobaan file input pake close
//        System.out.println("file input bernilai : " + fileInput);
//
//        fileInput = new FileInputStream("input.txt");
//        System.out.println("file input bernilai : " + fileInput);
//
//        fileInput.close();
//        System.out.println("file input bernilai : " + fileInput);
//
//        fileInput = new FileInputStream("input2.txt");
//        System.out.println("file input bernilai : " + fileInput);

    }
}
