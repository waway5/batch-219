package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("masukkan bilangan ke 1 : ");
        a = in.nextInt();
        System.out.print("masukkan bilangan ke 2 : ");
        b = in.nextInt();
        if (a<0 && b<0){
            System.out.println("negatif");
        }else{
            System.out.println("positif");
        }
    }
}
