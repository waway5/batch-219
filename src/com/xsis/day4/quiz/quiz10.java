package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz10 {
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
            System.out.print("masukan kata : ");
            a = in.nextLine();
            n[i]=a;
        }
        System.out.println("initial done !!!");
    }

    static void showArray(String[] n){
        System.out.println("-Array-");
        for (int i = 0; i < n.length; i++) {
            System.out.println("value : "+n[i]);
        }
    }

    static void kondisi(String[] n){
        for (int i = 0; i < n.length; i++) {
           int w = 0;
            for (int j = 0; j < n[i].length(); j++) {
                if (n[i].charAt(j) == 'w'){
                    w++;
                }
            }
            if (w>=2){
                System.out.println("yang mengandung 2 huruf w adalah : "+n[i]);
            }
        }

    }
}
