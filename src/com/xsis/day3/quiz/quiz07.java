package com.xsis.day3.quiz;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat;
        int i,kata;
        kata = 1;
        i = 0;
        System.out.print("Masukan Kalimat : ");
        kalimat = in.nextLine();
        while ( i < kalimat.length()){
            if (kalimat.charAt(i) == ' '){
                kata ++;
            }
            i++;
        } System.out.println("kalimat yang dimasukkan mengandung "+kata+" kata");

    }
}
