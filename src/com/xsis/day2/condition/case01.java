package com.xsis.day2.condition;

import java.util.Scanner;

public class case01 {
    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan hari dalam angka : ");
        day = in.nextInt();
        // gunakan switch
        switch (day){
            case 1 :
                System.out.println("Minggu");
                break;
            case 2 :
                System.out.println("Senin");
                break;
            case 3 :
                System.out.println("Selasa");
                break;
            case 4 :
                System.out.println("Rabu");
                break;
            case 5 :
                System.out.println("Kamis");
                break;
            case 6 :
                System.out.println("Jum'at");
                break;
            case 7 :
                System.out.println("Sabtu");
                break;
            default :
                System.out.println("kiamaat...");
                break;
        }
    }
}
