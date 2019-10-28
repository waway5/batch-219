package com.xsis.day2.pr;

import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Masukkan bilangan antara 0 hingga 999 : ");
        a = in.nextInt();
        if (a >= 100 && a < 1000){
            System.out.println("kamu memasukan 3 digit");
        }else if (a >= 10 && a < 100){
            System.out.println("kamu memasukan 2 digit");
        }else if (a < 10){
            System.out.println("kamu memasukan 1 digit");
        }
    }
}
