package com.xsis.day4.quiz;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner in = new Scanner(System.in);
        initialScanner(in,n);
        showArray(n);
        reverseValues(n);

    }

    //scanner
    static void initialScanner(Scanner in, int[] n){
        int a;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input : ");
            a = in.nextInt();
            n[i]=a;
        }
        System.out.println("input done ...");
    }

    // show array

    static void showArray(int[] n){
        System.out.println("show values ...");
        for (int i = 0; i < n.length; i++) {
            System.out.println("value : "+n[i]);
        }
    }

    static void reverseValues(int[] n){
        System.out.println("after reverse...");
        for (int i = n.length-1; i >=0 ; i--) {
            n[i] = n[i]*n[i];
            System.out.println("Value : "+n[i]);
        }
    }
}
