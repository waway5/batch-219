package com.xsis.day1;

//konversi dari fareinheti ke kelvin
// rumus : kelvin = (fareinheit + 459.67)/1.8


import java.util.Scanner;

public class Practice08 {
    static final double cf = 459.67;
    static final double cd = 1.8;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double farenheit, kelvin;
        System.out.print("Input Temperature in Farenheit : ");
        farenheit = scan.nextDouble();
        kelvin = (farenheit + cf)/cd;
        System.out.print("After Conversion to Kelvin : "+kelvin);


    }
}
