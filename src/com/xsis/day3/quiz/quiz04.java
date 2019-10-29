package com.xsis.day3.quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        String save = "";
        c=0;
        a=0;
        do {
            System.out.print("input angka : ");
            b = in.nextInt();
            if ( b != 0 ){
                save += b;
            }
            c += b;
            a++;
        }
        while (b!=0);
        System.out.println(save);
        System.out.println("total : "+c);
    }
}
