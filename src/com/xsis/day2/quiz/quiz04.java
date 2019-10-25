package com.xsis.day2.quiz;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        System.out.print("Masukkan kalimat : ");
        a =  in.nextLine();
        if (a.length() > 20){
            System.out.println("Many Characters");
        }else{
            System.out.println("Character");
        }
    }
}
