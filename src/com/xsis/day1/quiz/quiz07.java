package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz07 {
    static final double pajak = .20;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hargaProduk1, hargaProduk2, hargaProduk3, totalHargaSebelumPajak,totalSetelahPajak, rata2SebelumPajak, rata2SetelahPajak;

        System.out.print("Input product 1 : ");
        hargaProduk1 = scan.nextDouble();
        System.out.print("Input product 2 : ");
        hargaProduk2 = scan.nextDouble();
        System.out.print("Input product 3 : ");
        hargaProduk3 = scan.nextDouble();

        totalHargaSebelumPajak = hargaProduk1 + hargaProduk2 + hargaProduk3;
        totalSetelahPajak = ((hargaProduk1 + (hargaProduk1 * pajak)) + (hargaProduk2 + (hargaProduk2 * pajak)) + (hargaProduk3 + (hargaProduk3 * pajak)));
        rata2SebelumPajak = totalHargaSebelumPajak / 3;
        rata2SetelahPajak = totalSetelahPajak / 3;

        System.out.println("-----------------------------------------");
        System.out.println("Harga Product 1 : "+hargaProduk1);
        System.out.println("Harga Product 2 : "+hargaProduk2);
        System.out.println("Harga Product 3 : "+hargaProduk3);
        System.out.println("-----------------------------------------");
        System.out.println("Total Harga Sebelum Pajak : "+totalHargaSebelumPajak);
        System.out.println("Total Harga Setelah Pajak 20% : "+totalSetelahPajak);
        System.out.println("Rata-rata Sebelum Pajak : "+ rata2SebelumPajak);
        System.out.println("Rata-rata Setelah Pajak : "+rata2SetelahPajak);
        System.out.println("-----------------------------------------");

    }
}