package com.xsis.day2.condition;

public class if01 {
    public static void main(String[] args) {
        String a,b,c;
        a = "xsis";
        b = "xsis";
        c = "hello";

        //membandingkan
        if (a.equals(b)){
            System.out.println("Object String Equal");
        }else {
            System.out.println("Object String beda");
        }

        //negation
        if (!a.equals(c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //mencari siswa yang umurnya lebih dari 20 tahun dan ipk lebih dari 3.01 dan kurang dari 3.5

        int umur = 21;
        double ipk = 3.01;

        if(umur>20 && ipk>=3.01 && ipk<3.5){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
