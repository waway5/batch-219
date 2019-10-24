package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        double s, u=0, a,t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan : ");
        a = scan.nextDouble();
        System.out.print("Masukkan Waktu : ");
        t = scan.nextDouble();
        s = u+(a*t*t)*0.5;
        System.out.println("Jarak Mobil Adalah : "+s +"M");
    }
}
