package com.xsis.day2.pr;

import java.util.Scanner;

public class pr25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight,total;
        String destination, inside ="I", outside = "O";
        System.out.print("Input Destination (I/O) : ");
        destination = in.nextLine();
        System.out.print("Input weight : ");
        weight = in.nextDouble();


        if (destination.equals(inside) && weight < 1){
            total = weight * 0.010;
            System.out.println("Total Price : "+total);
        }else if (destination.equals(outside) && weight >= 1 && weight < 2) {
            total = weight * 10;
            System.out.println("Total Price : " + total);
        }else if (destination.equals(outside) && weight >= 2 && weight < 4) {
            total = weight * 10;
            System.out.println("Total Price : " + total);
        }else if (destination.equals(outside) && weight >= 4) {
            total = weight * 10;
            System.out.println("Total Price : " + total);
        }else if (destination.equals(inside) && weight >= 1 && weight < 2) {
            total = weight * 0.013;
            System.out.println("Total Price : " + total);
        }else if (destination.equals(inside) && weight >= 2 && weight < 4) {
            total = weight * 0.015;
            System.out.println("Total Price : " + total);
        }else if (destination.equals(inside) && weight >= 4) {
            total = weight * 0.020;
            System.out.println("Total Price : " + total);
        }
    }
}// belum selesai
