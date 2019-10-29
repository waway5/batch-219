package com.xsis.day3.pretest;

import java.util.Scanner;

public class wh05 {
    public static void main(String[] args) {
        double p,a;
        int i;
        Scanner in = new Scanner(System.in);

        p = 1;
        i=1;
        while (i <= 3){
            System.out.print("input number : ");
            a = in.nextDouble();
            p = p * a;
            i++;
        }
        System.out.println("p : "+p);
    }
}
