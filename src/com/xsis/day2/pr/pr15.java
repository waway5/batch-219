package com.xsis.day2.pr;

import java.util.Scanner;

public class pr15 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bilangan,satuan="",desimal="";
        int a,b;
        System.out.print("masukan bilangan : ");
        bilangan = in.next();
        a = bilangan.charAt(0);
        b = bilangan.charAt(2);
        if (bilangan.matches(IS_NUMERIC)) {
            switch (a) {
                case '1':
                    satuan ="satu";
                    break;
                case '2':
                    satuan = "dua";
                    break;
                case '3':
                    satuan = "tiga";
                    break;
                case '4':
                    satuan = "empat";
                    break;
            }
            switch (b) {
                case '1':
                    desimal = "satu";
                    break;
                case '2':
                    desimal = "dua";
                    break;
                case '3':
                    desimal = "tiga";
                    break;
                case '4':
                    desimal = "empat";
                    break;
                case '5':
                    desimal = "lima";
                    break;
                case '6':
                    desimal = "enam";
                    break;
                case '7':
                    desimal = "tujuh";
                    break;
                case '8':
                    desimal = "delapan";
                    break;
                case '9':
                    desimal = "sembilan";
                    break;
            }
            System.out.println(satuan+" koma "+desimal);
        }else {
            System.out.println("bukan angka");
        }
    }
}
