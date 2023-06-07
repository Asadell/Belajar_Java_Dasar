package com.tutorial;

import java.io.*;
// ~ 06/02/2023 ~
public class Main {
    public static void main(String[] args) throws IOException {
        long waktuStart, waktuFinish;

        // membaca file biasa
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        //menghitung waktu
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu yg dibutuhkan ialah : " + (waktuFinish - waktuStart));
        byteInput.close();

        System.out.println(" ");

        //membaca file buffer
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferInput = new BufferedInputStream(byteInput2);

        bufferInput.mark(200); //kalo gaada ini gabisa pake 'reset'
        //menghitung waktu
        waktuStart = System.nanoTime();
        System.out.println(bufferInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu yg dibutuhkan ialah : " + (waktuFinish - waktuStart));

        //baca ulang
        bufferInput.reset();
        byte [] dataa = bufferInput.readAllBytes();
        String dataString = new String(dataa);
        System.out.println(dataString);

        //menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        //write data berupa byte
        bufferedOutput.write(dataa,0,dataa.length);
        bufferedOutput.flush();

        byteInput2.close();
        bufferInput.close();
        byteOutput.close();
        bufferedOutput.close();
    }
}
