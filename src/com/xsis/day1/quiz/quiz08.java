package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalBelanja, hemat,diskon, totalSetelahDiskon;

        System.out.print("Total Belanja : ");
        totalBelanja = scan.nextDouble();
        System.out.print("Masukkan Diskon : ");
        diskon = scan.nextDouble();
        hemat = (totalBelanja * diskon)/100;
        totalSetelahDiskon = totalBelanja - hemat;

        System.out.println("Total Belanja : "+totalBelanja);
        System.out.println("Anda Menghemat Sebesar : "+hemat);
        System.out.println("Total Yang Harus dibayar : "+ totalSetelahDiskon);
    }
}
