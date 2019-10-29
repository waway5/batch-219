package com.xsis.day4.materi;

import java.util.Scanner;

public class array2d03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] a = new int[2][3];

        //initial value untuk tiap rom,coloumn;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("masukan data : ");
                a[i][j] = in.nextInt();
            }
        }

        //show list array
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
