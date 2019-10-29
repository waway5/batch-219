package com.xsis.day3.nested;

import java.util.Scanner;

public class nest04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <= n ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
