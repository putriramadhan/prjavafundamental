package com.juaracoding.prjavafundamental.pengulangan;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 19:36
@Last Modified 29/09/2024 19:36
Version 1.0
*/

public class LoopFor {
    public static void main(String[] args) {
//        System.out.println(1.0);
//


//        for(int i=1; i<=10; i++){
//            System.out.println("Nilai i adalah : "+i);
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

        // contoh penggunaan break dan perulangan dengan menemukan kondisi isFound = true maka akan langsung berhenti
//        boolean isFound = false;
//        for (int j = 0; j < 5; j++) {
//            if(j==2){
//                isFound = true;
//                break;
//            }
//            System.out.println("Nilai i adalah : "+j);
//        }
//        if(isFound){
//            System.out.println("SUDAH KETEMU");
//        }else {
//            System.out.println("BELUM DITEMUKAN");
//        }


        // contoh penggunaan continue untuk melompati tetapi tidak menghentikan perulangan
        // sedangkan return untuk mengehntikan kondisi perulangan

        // ini variable untuk bla blabla
//          int x, y ,z , h, f;
//        for (int i = 1; i < 5; i++) {
//            if(i==2){
//                continue;
//            }
//            for (int j = 1; j <=3 ; j++) {
//                System.out.println("Nilai i : "+i+" J Tereksekusi "+j);
//
//            }
//        }

        // contoh penggunakan if-else karena pengkondisian lebih dari 1
        String strHuruf = "J";
        strHuruf = strHuruf.toLowerCase();
        if(strHuruf.equals("a") || strHuruf.equals("i") ||
                strHuruf.equals("u") | strHuruf.equals("e") ||
                strHuruf.equals("o")
        ){
            System.out.println("Huruf ini adalah Vokal");
        }else {
            System.out.println("Huruf ini adalah Konsonan");
        }
//
//
    }
}

