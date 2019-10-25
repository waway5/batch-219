package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b;
        System.out.print("masukkan kata : ");
        a = in.nextLine();
        b = a.toUpperCase();
        if (a.equals(b)){
            System.out.println("Huruf Besar");
        }else{
            System.out.println("Bukan huruf besar");
        }
    }
}
