package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scan = new Scanner(System.in);
        initArrayScanner(scan, n);
        showArray(n);
    }

    //scanner
    static void initArrayScanner(Scanner scan, int[] n){
        double b;
        int a;
        for (int i = 0; i < n.length; i++) {
            System.out.print("input : ");
            a = scan.nextInt();
            n[i]=a;
        }
        System.out.println("input array done");
    }

    //show array
    static void showArray(int[] n){
        System.out.println("after power of three...");
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i] * n[i];
            System.out.println("value : "+n[i]);
        }
    }


}
