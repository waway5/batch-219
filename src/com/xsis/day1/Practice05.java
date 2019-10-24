package com.xsis.day1;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        double literPerkilo, totalJarakTempuh, totalLiter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Total Jarak Tempuh : ");
        totalJarakTempuh = scan.nextDouble();
        System.out.print("Total Bensin yang dipakai : ");
        totalLiter = scan.nextDouble();
        // calculate satu liter per kilo nya
        literPerkilo =  totalJarakTempuh / totalLiter;
        System.out.println("Satu Liter per kilo : "+ literPerkilo);

    }
}
