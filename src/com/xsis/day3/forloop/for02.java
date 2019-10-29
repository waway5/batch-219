package com.xsis.day3.forloop;

import java.util.Scanner;

public class for02 {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print(" How many loop : ");
        number = in.nextInt();
        for (int j = 0 ; j < number ; j++){
            System.out.println("j = "+j);
        }
    }
}
