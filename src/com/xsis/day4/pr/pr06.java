package com.xsis.day4.pr;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ulang=true;
        String cek,nmBarang;
        int tujuan,member,bayar;
        double beratBarang,ongkir,biayaPilihan=0,kembalian=0,jumlahBayar=0;
        while (ulang){
            System.out.print("Nama barang : ");
            nmBarang = in.next();
            System.out.print("Berat Barang : ");
            beratBarang = in.nextDouble();
            if (beratBarang %1 < .3){
                beratBarang = Math.floor(beratBarang);
            }else {
                beratBarang = Math.ceil(beratBarang);
            }
            ongkir = beratBarang * 5000;
            System.out.println("Tujuan : ");
            System.out.println("1. Dalam Kota");
            System.out.println("2. Antar Kota satu pulau");
            System.out.println("3. Antar Kota beda pulau");
            System.out.println("0. Tidak jadi");
            System.out.print("Masukkan Tujuan : ");
            tujuan = in.nextInt();
            switch (tujuan){
                case 1:
                    biayaPilihan = 2000 + ongkir;
                    break;
                case 2:
                    biayaPilihan = 10000 + ongkir;
                    break;
                case 3:
                    biayaPilihan = 50000 + ongkir;
                    break;
                default:
                    System.out.println("Terima kasih");
                    System.exit(0);
            }
            System.out.println("Membership?");
            System.out.println("1. Member");
            System.out.println("2. Non Member");
            System.out.print("Status : ");
            member = in.nextInt();
            switch (member){
                case 1:
                    if (biayaPilihan >= 200000) {
                        biayaPilihan = biayaPilihan - 15000;
                        System.out.println("Cashback : 15000");
                    }else {
                        System.out.println("maaf tidak ada cashback");
                    }
                    break;
                case 2:
                    biayaPilihan = biayaPilihan;
                    break;
                default:
                    System.out.println("maaf pilihan tidak tersedia");
                    System.exit(0);
            }
            System.out.println("-------------------------");
            System.out.println("nama barang : "+nmBarang);
            System.out.println("total biaya : "+biayaPilihan);
            System.out.println("bayar :");
            System.out.println("1. tunai");
            System.out.println(("2. Non tunai"));
            bayar = in.nextInt();
            switch (bayar){
                case 1:
                    System.out.println("input bayar : ");
                    jumlahBayar = in.nextDouble();
                    kembalian = jumlahBayar - biayaPilihan;
                    break;
                case 2:
                    System.out.println("transfer ke rek. ini");
                    break;
            }
            System.out.println("bayar "+jumlahBayar);
            System.out.println("kembalian : "+kembalian);
            System.out.print("Mau kirim lagi? (y/t) : ");
            cek = in.next();
            if (cek.equalsIgnoreCase("y")){
                ulang = true;
            }else if (cek.equalsIgnoreCase("t")){
                ulang = false;
            }
        }
    }
}
