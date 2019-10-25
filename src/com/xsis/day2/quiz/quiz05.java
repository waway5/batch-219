package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("angka ke 1: ");
        a = in.nextInt();
        System.out.print("angka ke 2: ");
        b = in.nextInt();
        System.out.print("angka ke 3: ");
        c = in.nextInt();
        System.out.print("angka ke 4: ");
        d = in.nextInt();

        if ( a>0 && b>0 && c>0 && d>0){
            System.out.println("Dari angka yang dimasukkan, semuanya positif");
        }else{
            System.out.println("Dari angka yang dimasukkan, salah satunya negatif");
        }
    }
}
