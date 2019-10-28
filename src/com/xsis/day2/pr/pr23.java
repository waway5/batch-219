package com.xsis.day2.pr;

import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c;
        System.out.print("input weight 1 : ");
        a = in.nextInt();
        System.out.print("input weight 2 : ");
        b = in.nextInt();
        System.out.print("input weight 3 : ");
        c = in.nextInt();

        if (a>b && a>c){
            System.out.println("person 1 is the heaviest");
        }else if (b>a && b>c){
            System.out.println("person 2 is the heaviest");
        }else if (c>a && c>b){
            System.out.println("person 3 is the heaviest");
        }
    }
}
