package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz03 {
    static final double pajak = .07;
    static final double tips = .10;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hargaMakanan, totalHargaMakanan;

        System.out.print("Harga Makanan : ");
        hargaMakanan = scan.nextDouble();
        totalHargaMakanan = hargaMakanan + (hargaMakanan * pajak) + (hargaMakanan * tips);
        System.out.println("Harga Makanan : "+hargaMakanan);
        System.out.println("Pajak : "+pajak);
        System.out.println("Tips : "+tips);
        System.out.println("Total Harga Makanan : "+totalHargaMakanan);
    }
}
