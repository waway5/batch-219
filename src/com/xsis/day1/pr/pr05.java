package com.xsis.day1.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week,day,hour,minute,second,bilangan,sisa;
        System.out.print("input seconds : ");
        bilangan = scan.nextInt();
        week = bilangan / 604800;
        sisa = bilangan % 604800;
        day = sisa / 86400;
        sisa = sisa % 86400;
        hour = sisa / 3600;
        sisa = sisa % 3600;
        minute = sisa / 60;
        sisa = sisa % 60;
        second = sisa;
        sisa = sisa % 1;
        System.out.println(week+" week "+day+" day "+hour+" hour "+minute+" minute "+second+" second");
    }
}
