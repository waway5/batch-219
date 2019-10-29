package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner in = new Scanner(System.in);
        initialScanner(in, n);
        showArray(n);
    }
    //scanner
    static void initialScanner(Scanner in, int[] n){
        int a;
        for (int i = 0; i < n.length; i++) {
            System.out.print("input : ");
            a = in.nextInt();
            n[i]=a;
        }
        System.out.println("input done...");
    }
    //show array
    static void showArray(int[] n){
        System.out.println("Show array...");
        for (int i = n.length-1 ; i >= 0 ; i--) {
            if (n[i] % 5 == 0) {
                System.out.println("value : " + n[i]);
            }
        }
    }
}
