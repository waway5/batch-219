package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner in = new Scanner(System.in);
        initialScanner(in,n);
        showArray(n);
        kondisi(n);
    }

    static void initialScanner(Scanner in, int[] n){
        int a;
        for (int i = 0; i < n.length; i++) {
            System.out.print("input : ");
            a = in.nextInt();
            n[i]=a;
        }
        System.out.println("initial done...");
    }

    static void showArray(int[] n){
        System.out.println("-show array-");
        for (int i = 0; i < n.length ; i++) {
            System.out.println("value : "+n[i]);
        }
    }

    static void kondisi(int[] n){
        int a=0,b=0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 0){
                a+=n[i];
            }
            if (n[i] < 0){
                b+=n[i];
            }
        }
        System.out.println("total negatif : "+b);
        System.out.println("total positif : "+a);
    }

}
