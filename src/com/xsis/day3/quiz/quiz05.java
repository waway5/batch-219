package com.xsis.day3.quiz;

public class quiz05 {
    static final double a = 0.03;
    public static void main(String[] args) {
        double b,c,d;
        c = 1;
        d = 30000;
        while (d <= 100000){
            b = d * a;
            d += b;
            c ++;
            System.out.println("pertambahan tahun ke "+c+" :"+Math.round(b));
        }
        System.out.println("Untuk mencapai 100000 populasi dibutuhkan waktu selama "+c+" tahun");
    }
}
