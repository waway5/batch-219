package com.xsis.day3.nested;

import java.util.Scanner;

public class nest05 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print("* ");

        }
        System.out.println();

        for (int i = 1; i <= n-2 ; i++) {
            System.out.print("* ");
            for (int j = 1; j <= n-2 ; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 1; i <= n ; i++) {
            System.out.print("* ");

        }
    }
}
