package com.xsis.day2.condition;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}
