package com.xsis.day1.quiz;

import java.util.Scanner;

public class quiz06 {
    static final double cw = 703;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight,height, bmi;
        System.out.print("Input Weight : ");
        weight = scan.nextDouble();
        System.out.print("Input Height : ");
        height = scan.nextDouble();
        bmi = weight / (height*height);
        System.out.println("Your BMI is : "+bmi);

    }
}
