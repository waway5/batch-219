package com.xsis.day2.pr;

import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("---------------------");
        System.out.println("1. Gallons to Litters");
        System.out.println("2. Litters to Gallons");
        System.out.print("Enter Your Choice : ");
        a = in.nextInt();
        switch (a){
            case 1 :
                System.out.println("1 gallon = 3.785 litters");
                break;
            case 2 :
                System.out.println("1 litter = 0.264 gallons");
                break;
            default :
                System.out.println("Pilihannya cuma 2 bre");
        }
    }
}
