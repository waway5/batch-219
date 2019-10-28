package com.xsis.day2.pr;

import java.util.Scanner;

public class pr24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b;
        System.out.print("input amount : ");
        a = in.nextDouble();
        if (a >= 150){
            b = a - ((a*20)/100);
            System.out.println("discount 20%");
            System.out.println("Amount to pay : "+b);
        }else if (a >= 70 && a < 150 ){
            b = a - ((a*10)/100);
            System.out.println("discount 10%");
            System.out.println("Amount to pay : "+b);
        }else if (a >= 30 && a < 70){
            b = a - ((a*5)/100);
            System.out.println("discount 5%");
            System.out.println("Amount to pay : "+b);
        }else if (a < 30){
            System.out.println("Amount to pay : "+a);
        }
    }
}
