package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz01 {
    static final double jumlahsudut = 180;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sudut1, sudut2, sudut3;
        System.out.print("Input Sudut 1 : ");
        sudut1 = scan.nextDouble();
        System.out.print("Input Sudut 2 : ");
        sudut2 = scan.nextDouble();
        sudut3 = jumlahsudut - (sudut1 + sudut2);
        System.out.println("sudut Ke Tiga adalah : "+sudut3);
    }
}
