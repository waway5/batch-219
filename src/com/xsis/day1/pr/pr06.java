package com.xsis.day1.pr;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit1,digit2,digit3,digit4,bilangan,sisa,total;
        System.out.println("------Available Cash In------");
        System.out.println("-------$20, $10, $5, $1------");
        System.out.println("-----------------------------");
        System.out.print("Withdraw : ");
        bilangan = scan.nextInt();
        digit1 = bilangan / 20;
        sisa = bilangan % 20;
        System.out.println(digit1+" Notes of $20");
        digit2 = sisa / 10;
        sisa = sisa % 10;
        System.out.println(digit2+" Notes of $10");
        digit3 = sisa / 5;
        sisa = sisa % 5;
        System.out.println(digit3+" Notes of $5");
        digit4 = sisa;
        sisa = sisa % 1;
        total = (digit1 * 20)+(digit2 * 10)+(digit3 * 5)+(digit4 * 1);
        System.out.println(digit4+" Notes of $1");
        System.out.println("Total : $"+total);
    }
}
