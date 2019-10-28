package com.xsis.day2.pr;

import java.util.Scanner;

public class pr17 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        System.out.print("Input integer : ");
        a = in.nextLine();
        if (a.matches(IS_NUMERIC)){
            if (Integer.parseInt(a) % 5 == 0 && Integer.parseInt(a) % 8 == 0){
                System.out.println(a+" divisible by 5 and 8");
            }else {
                System.out.println(a+" is not divisible by 5 and 8");
            }
        }else{
            System.out.println("invalid input!!!");
        }
    }
}
