package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz09 {
    static final double kwh = 15000;
    static final double pajak = .20;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double awal, akhir, konsumsi, tagihan, tagihanSetelahPajak;

        System.out.print("kWh Awal Bulan : ");
        awal = scan.nextDouble();
        System.out.print("kWh Akhir Bulan : ");
        akhir = scan.nextDouble();
        konsumsi = akhir - awal;
        tagihan = konsumsi * kwh;
        tagihanSetelahPajak = tagihan +(tagihan * pajak);
        System.out.println("Jumlah kWh yang dikonsumsi : "+konsumsi);
        System.out.println("Tagihan yang harus dibayar : "+tagihan);
        System.out.println("Jumlah Tagihan yang harus dibayar + pajak 20% : "+tagihanSetelahPajak);
    }
}

