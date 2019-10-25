package com.xsis.day2.string;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name,st;
        double a;
        System.out.print("Masukkan user name : ");
        name = in.nextLine();
        st = name.substring(0,4);
        a = Math.random() * 100 + 100;
        System.out.println("Hasil : "+st+Math.round(a));
    }
}
