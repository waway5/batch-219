package com.xsis.day1.pr;

import java.util.Scanner;

public class pr07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mile,yard,feet,inch,step,sisa;
        System.out.print("Input Steps : ");
        step = scan.nextInt();
        mile = step / 63360;
        sisa = step % 63360;
        yard = sisa / 36;
        sisa = sisa % 36;
        feet = sisa / 12;
        sisa = sisa % 12;
        inch = sisa;
        sisa = sisa % 1;
        System.out.println(mile+" Miles "+yard+" Yard "+feet+" Feet "+inch+" Inch");
    }
}
