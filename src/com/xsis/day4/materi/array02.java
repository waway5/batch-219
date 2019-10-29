package com.xsis.day4.materi;

import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        int[] n = new int[5];
        //int[] n = {2, 3, 15, 14, 5, 16};
        //initArray(n);
        Scanner scan = new Scanner(System.in);
        initArrayScanner(scan,n);
        showArray(n);
        //replaceIndexArray(n);
        //replaceIndexArrayWithParams(n, 10,  100);
        replaceIndexArray(n, 15, 100);
        showArray(n);
    }

    static void initArrayScanner(Scanner scan, int[] n){
        int a;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input : ");
            a = scan.nextInt();
            n[i]=a;
        }
        System.out.println("init array done");
    }

    // method untuk inisialisai array
    static void initArray(int[] n) {
        System.out.println("initial array ...");
        n[0] = 1;
        n[1] = 2;
        n[2] = 12;
        n[3] = 4;
        n[4] = 10;
    }

    // method display array
    static void showArray(int[] n) {
        System.out.println("Show Array ...");
        for (int i = 0; i < n.length; i++) {
            System.out.println("value : " + n[i]);
        }
    }

    //replace value index array
    static void replaceIndexArray(int[] n) {
        System.out.println("replace ...");
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 12) {
                n[i] = 25;
                System.out.println("index ke : " + i + " replace with value : " + 25);
            }
        }
    }

    // replace value index array with params
    static void replaceIndexArrayWithParams(int[] n, int searchNumber, int values) {
        System.out.println("replace with params ...");
        for (int i = 0; i < n.length; i++) {
            if (n[i] == searchNumber) {
                n[i] = values;
                System.out.println("index ke : " + i + " replace with value : " + values);
            }
        }
    }

    // overload method nama sama tapi parameternya beda
    static void replaceIndexArray(int[] n, int searchNumber, int values) {
        System.out.println("replace with params ...");
        for (int i = 0; i < n.length; i++) {
            if (n[i] == searchNumber) {
                n[i] = values;
                System.out.println("index ke : " + i + " replace with value : " + values);
            }
        }
    }
}
