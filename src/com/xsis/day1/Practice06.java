package com.xsis.day1;

import java.util.Scanner;

//calculate tax per item
public class Practice06 {
    static final double pajak = .15;
    public static void main(String[] args) {
        double itemBeforeTax, itemAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang Sebelum Pajak : ");
        itemBeforeTax = scan.nextDouble();
        itemAfterTax = itemBeforeTax + (itemBeforeTax * pajak);
        System.out.println("Harga Barang Setelah Pajak : "+itemAfterTax);

    }
}
