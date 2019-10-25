package com.xsis.day2.condition;

import java.util.Scanner;

public class if04 {
    public static void main(String[] args) {
        int score;
        char grade ='0';
        Scanner in = new Scanner(System.in);
        System.out.print("Input Score : ");
        score = in.nextInt();

        if (score > 90) {
            grade = 'A';
        } else if (score < 90) {
            grade = 'C';
        }
        System.out.println("Grade : " +grade);

    }
}
