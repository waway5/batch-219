package com.xsis.day1;

import java.util.Scanner;

//menghitung luang lingkaran

/* rumus luas lingkaran
*  area = pi*(r*r)
* pi = 3.14
**/

public class Practice04 {
    // deklarasikan variable pi menjadi static
    // variabel agar bisa diakses oleh main method
    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, radius;
        System.out.print("Radius : ");
        radius = scan.nextDouble();
        area = pi * (radius*radius);
        System.out.println("Luas Lingkaran : "+area);

    }
}
