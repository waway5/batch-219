package com.xsis.day2.pr;

import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a ;
        System.out.print("input an integer : ");
        a = in.nextInt();

        if(a%6 == 0 && a != 0){
            System.out.println(a+" adalah kelipatan 6");
        }else{
            System.out.println(a+" bukan kelipatan 6");
        }
    }
}
