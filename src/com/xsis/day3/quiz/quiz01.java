package com.xsis.day3.quiz;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,sum;
        double ave;
        sum = 0;
        System.out.print("How many input? : ");
        b = in.nextInt();
        for (int i = 1; i <= b ; i++) {
            System.out.print("Input "+i+": ");
            a = in.nextInt();
            sum += a;
        }
        ave = sum / b;
        System.out.println("total : "+sum);
        System.out.println("average : "+ave);
    }
}
