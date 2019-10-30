package com.xsis.day4.pr;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cost=0,budget=0,total=0,sisa=0,i=1;

        System.out.print("Enter your monthly budget : $");
        budget = in.nextInt();
        System.out.println("Money spent this month (type -1 to quit):");
        System.out.println("-----------------------------------------");
        do {
            System.out.print("Enter Cost #"+i+": ");
            cost = in.nextInt();
            if (cost != (-1)){
                total += cost;
            }
            i++;
        }
        while (cost != (-1));
        sisa = budget - total;
        System.out.println("Total Costs: "+total);
        System.out.println("You are $"+sisa+" under your budget");
    }
}
