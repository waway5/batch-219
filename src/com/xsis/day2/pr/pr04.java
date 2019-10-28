package com.xsis.day2.pr;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Input an integer : ");
        a = in.nextInt();
        if (a >= 1000 && a<10000){
            System.out.println(a+" bilangan 4 digit");
        }else{
            System.out.println(a+" bukan bilangan 4 digit");
        }
    }
}
