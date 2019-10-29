package com.xsis.day4.materi;

public class array01 {
    public static void main(String[] args) {
        //inisialisasi array
        String[] grade = new String[4];

        // mengisi array
        grade[0] = "hello";
        grade[1] = "java";
        grade[2] = "dev";
        grade[3] = "world";

        // looping for untuk menampilkan nilai array

        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }

        // mencari nilai di array

        for (int i = 0; i < grade.length ; i++) {
            if(grade[i] == "java"){
                System.out.println("found in index : "+i);
            }
        }
    }
}
