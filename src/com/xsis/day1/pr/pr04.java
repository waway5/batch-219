package com.xsis.day1.pr;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan, hasil;
        System.out.print("Input Bilangan : ");
        bilangan = scan.nextInt();
        hasil = (bilangan + 1) % 2;
        System.out.println(hasil);
    }
}