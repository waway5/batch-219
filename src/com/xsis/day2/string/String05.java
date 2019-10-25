package com.xsis.day2.string;

public class String05 {
    public static void main(String[] args) {
        String s = "Hello Java Programmer";
        System.out.println("Length : "+s.length());

        // search kata java ada di posisi indeks berapa
        System.out.println("Index : "+s.indexOf("Java"));

        // substring untuk get sebuah string dari index ke -i s/d index ke j
        System.out.println("substr : "+s.substring(6,10));
    }
}
