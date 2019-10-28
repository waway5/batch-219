package com.xsis.day2.pr;

import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,kotor,bersih;
        System.out.print("Pembayaran : ");
        a = in.nextInt();
        System.out.print("jumlah jam kerja per minggu : ");
        b = in.nextInt();

        if(b > 40){
            kotor = (a * 2) * b;
            bersih = kotor - ((kotor * 30)/100);
            System.out.println("Gaji kotor : "+kotor);
            System.out.println("Gaji Bersih : "+bersih);
        }else if (b <= 40){
            kotor = a * b;
            bersih = kotor - ((kotor * 30)/100);
            System.out.println("Gaji kotor : "+kotor);
            System.out.println("Gaji Bersih : "+bersih);
        }
    }
}
