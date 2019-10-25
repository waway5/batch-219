package com.xsis.day1.pr;

import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit1,digit2,digit3,digit4,digit5,bilangan,sisa,hasil;

        System.out.print("Input Bilangan : ");
        bilangan = scan.nextInt();
        digit1 = bilangan /10000;
        sisa = bilangan % 10000;
        digit2 = sisa /1000;
        sisa = sisa % 1000;
        digit3 = sisa / 100;
        sisa = sisa % 100;
        digit4 = sisa /10;
        sisa = sisa % 10;
        digit5 = sisa;
        sisa = sisa % 1;
        hasil = (digit5 * 10000)+(digit4 * 1000)+(digit3 * 100)+(digit2 * 10)+(digit1 * 1);
        System.out.println("Setelah Dibalik : "+hasil);
    }
}
