package com.xsis.day1;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        double itemBeforeDiscount, itemAfterDiscount, Discount;
        Scanner scan = new Scanner(System.in);

        System.out.print("Harga Barang : ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.print("Diskon % : ");
        Discount = scan.nextDouble();
        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * Discount/100);
        System.out.println("Harga Barang Setelah Diskon : "+itemAfterDiscount);
    }
}
