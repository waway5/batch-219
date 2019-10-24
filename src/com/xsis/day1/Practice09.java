package com.xsis.day1;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan, digit1, digit2, digit3, digit4, sisa, totalJumlah;

        System.out.print("Input Bilangan : ");
        bilangan = scan.nextInt();

        digit1 = (int)bilangan/1000;
        sisa = bilangan % 1000;
        System.out.println("digit 1 : "+digit1+", sisa : "+sisa);
        digit2 = (int)sisa/100;
        sisa = sisa%100;
        System.out.println("digit 2 : "+digit2+", sisa : "+sisa);
        digit3 = (int)sisa/10;
        sisa = sisa % 10;
        System.out.println("digit 3 : "+digit3+", sisa : "+sisa);
        digit4 = (int)sisa;
        sisa = sisa%1;
        System.out.println("digit 4 : "+digit4+", sisa "+sisa);
        totalJumlah = digit1+digit2+digit3+digit4;
        System.out.println("Jumlah : "+totalJumlah);

        //
    }
}
