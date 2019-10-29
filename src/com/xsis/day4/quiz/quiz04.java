package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner in = new Scanner(System.in);
        initialScanner(in,n);
        showArray(n);
    }

    static void initialScanner(Scanner in, int[] n){
        int a ;
        for (int i = 0; i < n.length; i++) {
            System.out.print("input : ");
            a = in.nextInt();
            n[i]=a;
        }
        System.out.println("initial done...");
    }

    static void showArray(int[] n){
        System.out.println("-Show Array-");
        for (int i = 0; i < n.length ; i++) {
            if (n[i] % 2 == 0 || n[i] > 10)
            System.out.println("value : "+n[i]);
        }
    }
}
