package com.xsis.day2.pr;

import java.util.Scanner;

public class pr09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,total;
        System.out.print("Pembayaran : ");
        a = in.nextInt();
        System.out.print("jumlah jam kerja per minggu : ");
        b = in.nextInt();

        if(b > 40){
            c = (b - 40) * (2 * a);
            total = (a*b)+c;
            System.out.println("Gaji kotor : "+total);
        }else{
            total = a * b;
            System.out.println("Gaji kotor : "+total);
        }
    }
}
