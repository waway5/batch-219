package com.xsis.day4.pr;

public class pr02 {
    public static void main(String[] args) {
        int [][] a = new int[5][5];
        int total=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j){
                    a[i][j]=5;
                    total += a[i][j];
                }else if(i > j){
                    a[i][j]=88;
                }else {
                    a[i][j]=11;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length-1; j >=0 ; j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("total : "+total);
    }
}