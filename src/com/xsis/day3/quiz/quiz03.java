package com.xsis.day3.quiz;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        c = 0;
        for (a = 1; a <= 5; a++) {
            System.out.print("input " + a + ": ");
            b = in.nextInt();
            if (b >100 && b<1000){
                c += b;
            }
        }
        System.out.println("Total : "+c);
    }
}
