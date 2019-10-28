package com.xsis.day2.pr;

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, motor = "m", car = "c", truck = "t";
        System.out.print("Vehicle Initial : ");
        a = in.nextLine();
        if ( a.equals(motor) || a.equals(motor.toUpperCase())){
            System.out.println("Amount to pay : $1");
        }else if (a.equals(car) || a.equals(car.toUpperCase())){
            System.out.println("Amount to pay : $2");
        }else if (a.equals(truck) || a.equals(truck.toUpperCase())){
            System.out.println("Amount to pay : $4");
        }
    }
}
