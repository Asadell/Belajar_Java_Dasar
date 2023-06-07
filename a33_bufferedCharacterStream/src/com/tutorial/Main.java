package com.tutorial;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //membaca file
        FileReader fileInputtt = new FileReader("input.txt");
        BufferedReader bufferedReaderrr = new BufferedReader(fileInputtt);
        bufferedReaderrr.mark(200);

        //menulis string
        String data = bufferedReaderrr.readLine();
        System.out.println(data);

        bufferedReaderrr.reset(); //reset biar balik keawal

        //menulis char
        char [] charData = new char[25];
        bufferedReaderrr.read(charData,0,25);
        System.out.println(Arrays.toString(charData));

        //membaca baris
        bufferedReaderrr.reset();
        System.out.println(bufferedReaderrr.readLine());
        System.out.println(bufferedReaderrr.readLine());

        bufferedReaderrr.reset();

        //menulis file
        FileWriter fileOutputt = new FileWriter("output.txt");
        BufferedWriter bufferedOutputt = new BufferedWriter(fileOutputt);

        //menulis baris1
        String baris1 = bufferedReaderrr.readLine();
        bufferedOutputt.write(baris1,0,baris1.length());
        bufferedOutputt.flush();

        //enter
        bufferedOutputt.newLine();

        //menulis baris2
        String baris2 = bufferedReaderrr.readLine();
        bufferedOutputt.write(baris2,0,baris2.length());
        bufferedOutputt.flush();

        fileInputtt.close();
        fileOutputt.close();
        bufferedReaderrr.close();
        bufferedOutputt.close();



    }
}
