package com.juaracoding.prjavafundamental.exception;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 18:05
@Last Modified 29/09/2024 18:05
Version 1.0
*/

public class ProduceError {
    public static void main(String[] args) {
        String strToArr = "Ini ; Saya ...";
        char [] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        int intTampung = 0;
        for (int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if(intTampung>=58 && intTampung<=64){
                throw new IllegalArgumentException("Karakter Tidak Diperbolehkan ..."+chArr[i]);
            }
        }
        System.out.println("Berhasil kesini");
    }
}

