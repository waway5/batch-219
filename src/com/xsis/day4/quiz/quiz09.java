package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        String[] n = new String[3];
        Scanner in = new Scanner(System.in);
        initialScanner(in,n);
        showArray(n);
        kondisi(n);
    }

    static void initialScanner(Scanner in, String[] n){
        String a;
        for (int i = 0; i < n.length; i++) {

            System.out.print("Masukan kata : ");
            a = in.nextLine();
            n[i] = a;
        }
    }

    static void showArray(String[] n){
        System.out.println("-output-");
        for (int i = 0; i < n.length ; i++) {
            System.out.println("Value : "+n[i]);
        }
    }

    static void kondisi(String[] n){
        System.out.println("-hasil-");
        for (int i = 0; i < n.length; i++) {
            if (n[i].length() >= 10){
                System.out.println("yang lebih dari 10 karakter : "+n[i]);
            }
        }
    }
}
