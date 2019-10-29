package com.xsis.day4.materi;

import java.util.Scanner;

public class array2d05 {
    public static void main(String[] args) {
        int [][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j){
                    a[i][j]=-1;
                }else if(i > j){
                    a[i][j]=10;
                }else {
                    a[i][j]=20;
                }
            }
        }
        //show kotak array

        for (int i = 0; i < a.length ; i++) {
            for (int j = a[i].length-1; j >=0 ; j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println( );
        }
    }
}
