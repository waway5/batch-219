package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Bilangan 1 : ");
        a = in.nextInt();
        System.out.print("Bilangan 2 : ");
        b = in.nextInt();
        if (a > b){
            System.out.println(b+" "+a);
        }else{
            System.out.println(a+" "+b);
        }
    }
}
