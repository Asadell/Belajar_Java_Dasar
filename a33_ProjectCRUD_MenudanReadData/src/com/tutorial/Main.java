package com.tutorial;

import java.util.Scanner;

// 08/02/2023
public class Main {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while(isLanjutkan){
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilihan anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser){
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    break;
                default:
                    System.out.println("pilih jawaban dengan benar\nSilahkan pilih {1-5}");
            }

            isLanjutkan = getYesOrNo("apakah anda ingin melanjutkan");
        }
    }

    static void tampilkanData (){
        System.out.println("anda sedang melihat tampilan data");

        getYesOrNo("apakah anda ingin mengedit lagi?");
    }
    static boolean getYesOrNo (String message){
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n" + message + " (y/n)");
        String input = userInput.next();

        while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
            System.out.println("\npilihan anda bukan y/n");
            System.out.print(message + " (y/n) : ");
            input = userInput.next();
        }
        return input.equalsIgnoreCase("y");

    }
}
