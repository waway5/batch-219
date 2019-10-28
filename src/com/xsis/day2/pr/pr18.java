package com.xsis.day2.pr;

import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Beli berapa CD ? : ");
        a = in.nextInt();
        if (a==1) {
            System.out.println("anda mendapatkan 3 point");
        }else if (a==2){
          System.out.println("anda mendapatkan 10 point");
        }else if (a==3){
            System.out.println("anda mendapatkan 20 point");
        }else if (a>=4){
            System.out.println("anda mendapatkan 45 point");
        }
    }
}
