package com.xsis.day2.string;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        String s, r;
        s = "Hello Java Programmer ";
        System.out.println(s);
        r = s.substring(11,22) + s.substring(0,6) + s.substring(6,10);
        System.out.println(r);
    }
}
