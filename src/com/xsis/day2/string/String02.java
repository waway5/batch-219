package com.xsis.day2.string;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input, reverse;
        System.out.print("Masukan kata : ");
        input = in.nextLine();
        System.out.println("hasil : "+input);
        reverse = "" +input.charAt(3)+input.charAt(2)+input.charAt(1)+input.charAt(0);
        System.out.println("hasil reverse : "+reverse);
    }
}
