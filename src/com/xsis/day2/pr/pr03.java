package com.xsis.day2.pr;

import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilangan;
        System.out.print("Input an integer : ");
        bilangan = in.nextInt();
        if (bilangan % 4 == 0){
            System.out.println(bilangan +" adalah kelipatan 4");
            System.out.println(bilangan+" = "+bilangan/4+" x 4");
        }else{
            System.out.println(bilangan+" bukan kelipatan 4");
            System.out.println(bilangan+" = "+bilangan/4+" x 4"+" + "+bilangan%4);
        }

    }
}
