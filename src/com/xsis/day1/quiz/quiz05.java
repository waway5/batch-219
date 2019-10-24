package com.xsis.day1.quiz;

import java.util.Scanner;
//
public class quiz05 {
    static final double cc = 32;
    static final double cd = 1.8;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double derajatFahrenheit, celcius;

        System.out.print("Input Fahrenheit : ");
        derajatFahrenheit = scan.nextDouble();
        celcius = (derajatFahrenheit - cc)/cd;
        System.out.println("After Conversion to Celcius : "+celcius);
    }
}
