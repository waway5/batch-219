package com.xsis.day3.pretest;

import java.util.Scanner;

public class wh06 {
    public static void main(String[] args) {
        int sum,i,a;
        sum = 0;
        i=1;
        Scanner in = new Scanner(System.in);
        while (i <= 5){
            System.out.print("Input Number : ");
            a = in.nextInt();
            if ( a % 2 == 0){
                sum += a;
            }
            i++;
        }
        System.out.println("Summary : "+sum);

        }
//        i = 0;
//        sum = 0;
//        a = 0;
//        while (i<5){
//            sum += 2;
//            a += sum;
//            i++;
//            System.out.println(sum);
//        }
//        System.out.println("sum : "+a);
//    }
}
