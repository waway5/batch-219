package com.xsis.day2.pr;

import java.util.Scanner;

public class pr26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kwh,pay;
        System.out.println("Enter number of Kilowatt-hours consumed : ");
        kwh = in.nextInt();

        if(kwh <= 500){
            pay = kwh * 0.10;
            System.out.println("Total amount to pay = "+pay);
        }else if (kwh >=501 && kwh <=2000){
            pay = kwh * 0.25;
            System.out.println("Total amount to pay = "+pay);
        }else if(kwh >= 2001 && kwh <= 4000){
            pay = kwh * 0.40;
            System.out.println("Total amount to pay = "+pay);
        }else {
            pay = kwh * 0.60;
            System.out.println("Total amount to pay = "+pay);
        }

    }
}
