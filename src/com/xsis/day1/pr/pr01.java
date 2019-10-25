package com.xsis.day1.pr;

import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan,digit, hasil;
        System.out.print("Input bilangan : ");
        bilangan = scan.nextInt();
        digit = bilangan % 10;
        hasil = digit * 8;
        System.out.println("digit terakhir "+digit+" x 8 : "+hasil);
    }
}
