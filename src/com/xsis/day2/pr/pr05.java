package com.xsis.day2.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Bilangan ke-1: ");
        a = in.nextInt();
        System.out.print("Bilangan ke-2: ");
        b = in.nextInt();
         if (a > b){
             System.out.println(a+" lebih besar dari "+b);
         }else if(a < b){
             System.out.println(b+" lebih besar dari "+a);
         }
    }
}
