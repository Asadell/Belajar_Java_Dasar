package com.tutorial;

import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ImagingOpException {
        Scanner terminalInput = new Scanner(System.in);
        boolean isLanjutkan = true;

        while(isLanjutkan){
            System.out.println("\nDatabase Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilih : ");
            String inputt = terminalInput.next();

            switch (inputt){
                case "1":
                    System.out.println("\nseluruh buku");
                    liatBuku();
                    break;
                case "2":
                    System.out.println("\ncari buku");
                    break;
                case "3":
                    System.out.println("\ntambah buku");
                    break;
                case "4":
                    System.out.println("\nubah data buku");
                    break;
                case "5":
                    System.out.println("\nhapus data buku");
                    break;
                default:
                    System.out.println("input anda salah\npilih dengan benar (1 - 5)\n");
            }


            isLanjutkan = getYesorNo("Apakah anda ingin melanjutkan?");
        }
    }

    private static void liatBuku(){
        System.out.println("liat buku");
        boolean isTambah = getYesorNo("ingin ingin menambah buku?");
    }
    private static boolean getYesorNo (String massage){
        Scanner terminalInput = new Scanner(System.in);

        System.out.print("\n" +massage + " [y/n] : ");
        String inputt = terminalInput.next();

        while (!inputt.equalsIgnoreCase("y") && !inputt.equalsIgnoreCase("n")){
            System.out.print(massage + " [y/n] : ");
            inputt = terminalInput.next();
        }

        return inputt.equalsIgnoreCase("y");
    }
}






































