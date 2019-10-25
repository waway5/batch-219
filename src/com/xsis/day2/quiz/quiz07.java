package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        double rata2;
        System.out.print("point 1 : ");
        a = in.nextInt();
        System.out.print("point 2: ");
        b = in.nextInt();
        System.out.print("point 3 : ");
        c = in.nextInt();
        rata2 = (a+b+c)/3;
        if (rata2 > 60){
            System.out.println(rata2+" Suhu Panas");
        }else{
            System.out.println(rata2+" Normal");
        }
    }
}
