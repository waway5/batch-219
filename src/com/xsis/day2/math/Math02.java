package com.xsis.day2.math;

import java.util.Scanner;

public class Math02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, a, t;
        System.out.print("Jarak : ");
        s = in.nextDouble();
        System.out.print("Percepatan : ");
        a = in.nextDouble();

        t = Math.sqrt(2*s/a); // Math.sqrt adalah akar
        System.out.println("waktu yang ditempuh adalah : "+t);
        System.out.println("waktu yang ditempuh adalah : "+Math.round(t));
        // Math.round adalah pembulatan ke atas, jika > 0.5 return value dibulatkan ke 1
        System.out.println("waktu yang ditempuh adalah : "+Math.floor(t));
        // Math.floor adalah pembulatan kebawah, jika > 0.5, return value 0.5
    }
}
