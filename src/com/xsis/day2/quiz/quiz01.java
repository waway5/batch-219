package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a ;
        System.out.print("masukkan bilangan : ");
        a = in.nextInt();
        if (a<0){
            System.out.println("negatif");
        }else{
            System.out.println("positif");
        }
    }
}
