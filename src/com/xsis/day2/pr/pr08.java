package com.xsis.day2.pr;

import java.util.Scanner;

public class pr08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c,r;
        System.out.print("Performance 1 : ");
        a = in.nextInt();
        System.out.print("Performance 2 : ");
        b = in.nextInt();
        System.out.print("Performance 3 : ");
        c = in.nextInt();
        r = (a+b+c)/3;
        System.out.println("Average Performance : "+r);
        if (r >= 8){
            System.out.println("Qualified");
        }else if (r < 8){
            System.out.println("Dissqualified");
        }
    }
}
