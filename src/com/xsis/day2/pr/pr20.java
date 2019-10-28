package com.xsis.day2.pr;

import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int usd10,usd5,usd1,sisa,pin,wd;
        System.out.print("Enter PIN : ");
        pin = in.nextInt();

        if(pin != 1234){
            System.out.print("Invalid PIN!!!, Enter PIN : ");
            pin = in.nextInt();
            if (pin != 1234){
                System.out.print("Invalid PIN !!!, Enter PIN : ");
                pin = in.nextInt();
            }if (pin != 1234) {
                System.out.println("PIN Blocked!!!");
            }
        }else{
            System.out.print("Withdraw : ");
            wd = in.nextInt();
            usd10 = wd / 10;
            sisa = wd % 10;
            usd5 = sisa / 5 ;
            sisa = sisa % 5;
            usd1 = sisa;
            sisa = sisa %1;
            System.out.println(usd10+" lembar $10 ,"+usd5+" lembar $5, "+usd1+" lembar $1");
        }
    }
}
