package com.xsis.day3.quiz;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String genap = " ";
        int a,b,c;
        System.out.print("How many loop? : ");
        b = 0;
        c = 0;
        a = in.nextInt();
//        for (int i = 1; i <= a; i++) {
//            System.out.print("Input "+i+": ");
//            b = in.nextInt();
//            if (b % 2 == 0) {
//                genap += b;
//                c += b;
//            }
//        }
        while (a > 0){
            System.out.print("input : ");
            b = in.nextInt();
            if ( b % 2 == 0 ){
                c += b;
                genap += b;
            }
            a--;
        }
        System.out.println("Produk yang genap :"+b);
        System.out.println("Total : "+c);
    }
}
