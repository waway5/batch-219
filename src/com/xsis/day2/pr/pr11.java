package com.xsis.day2.pr;

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Miles Traveled : ");
        a = in.nextInt();

        if (a <= 6000){
            b = 6000 - a;
            System.out.println(b+" Miles to the minor service");
        }else if (a >= 6000 && a <= 12000){
            b = 12000 - a;
            System.out.println(b+" Miles to the mayor service");
        }
    }
}
