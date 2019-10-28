package com.xsis.day2.pr;

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("input percentage : ");
        a = in.nextInt();
        if (a >= 90 && a <= 100){
            System.out.println("A");
        }else if (a >= 80 && a <90){
            System.out.println("B");
        }else if (a >= 70 && a < 80){
            System.out.println("C");
        }else if (a >= 60 && a < 70){
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
