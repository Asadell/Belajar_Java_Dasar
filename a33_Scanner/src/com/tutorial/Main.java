package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

//  ~ 07/02/2023 ~
public class Main {
    public static void main(String[] args) throws IOException {

        //membaca file
        FileReader fileInputt = new FileReader("input.txt");
        BufferedReader bufferedInputt = new BufferedReader(fileInputt);

        //naro file di scanner
        Scanner scannerr = new Scanner(bufferedInputt);

        //ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scannerr.hasNext() + "\n"); //true

        // untuk membaca kata, dengan pemisah/delimeter 'spasi'
        System.out.println(scannerr.next());
        System.out.println(scannerr.next());
        System.out.println(scannerr.next());
        System.out.println(scannerr.next());
        System.out.println(scannerr.next());

        System.out.println(scannerr.hasNext() + "\n"); //false

        // menggunakan delimeter tertentu
        System.out.println("--pake use delimeter");
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedInputt = new BufferedReader(fileInput2);
        bufferedInputt.mark(200);

        scannerr = new Scanner(bufferedInputt);
        scannerr.useDelimiter(",");

        while (scannerr.hasNext()){
            System.out.println(scannerr.next());
        }
        bufferedInputt.reset();
        System.out.println();

        // menggunakan string tokenizer
        System.out.println("--baris ke-1");
        String dataa = bufferedInputt.readLine();
        System.out.println(dataa);

        StringTokenizer stringTokenn = new StringTokenizer(dataa, ",");

        while(stringTokenn.hasMoreTokens()){
            System.out.println(stringTokenn.nextToken());
        }

        System.out.println("\n--baris ke-2");
        dataa = bufferedInputt.readLine();
        System.out.println(dataa);

        stringTokenn = new StringTokenizer(dataa, ",");

        while(stringTokenn.hasMoreTokens()){
            System.out.println(stringTokenn.nextToken());
        }

    }
}
