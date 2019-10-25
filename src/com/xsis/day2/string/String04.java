package com.xsis.day2.string;

public class String04 {
    public static void main(String[] args) {

        String s, st;
        s = "Hello .NET Developer Welcome To Xsis Academy";
        System.out.println(s);
        // replace .NET menjadi JAVA
        st = s.replace(".NET","JAVA");
        System.out.println("replace #1 : "+st);
        // replace Welcome menjadi hello
        st = st.replace("Welcome","Hello");
        System.out.println("replace #2 : "+st);
        st = s.replace(".NET","JAVA")
                .replace("Welcome","Aloha")
                .replace("Xsis Academy","XA");
        System.out.println("replace #3 : "+st);
        // to lowercase mengubah menjadi huruf kecil semua, toUpperCase mengubah menjadi huruf besar semua
        st = s.replace(".NET","JAVA")
                .replace("Welcome","Aloha")
                .replace("Xsis Academy","XA").toLowerCase();
        System.out.println("replace #4 : "+st);
    }
}
