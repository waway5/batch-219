package com.xsis.day1.quiz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nilai1, nilai2, nilai3, nilai4, rata2;

        System.out.print("Input Nilai Ujian 1 : ");
        nilai1 = scan.nextDouble();
        System.out.print("Input Nilai Ujian 2 : ");
        nilai2 = scan.nextDouble();
        System.out.print("Input Nilai Ujian 3 : ");
        nilai3 = scan.nextDouble();
        System.out.print("Input Nilai Ujian 4 : ");
        nilai4 = scan.nextDouble();
        rata2 = (nilai1+nilai2+nilai3+nilai4)/4;
        System.out.println("Rata-rata Nilai Adalah : "+rata2);
    }
}
