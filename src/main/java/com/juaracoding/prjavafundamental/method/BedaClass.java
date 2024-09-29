package com.juaracoding.prjavafundamental.method;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 21:22
@Last Modified 29/09/2024 21:22
Version 1.0
*/

import java.util.Map;

public class BedaClass {
    @Override
    public String toString() {
        return "INI CLASS BEDA iStatic nilainya "+iStatic;
    }
/**
     * controller
     * service
     * repo
     * dto
     * model -> ORM (Konfigurasi ke Databases)
     * security
     * util
     * reponse
     */
    /**
     * view
     * controller
     * service
     * repo
     * util
     * reponse
     */

    public static void main(String[] args) {

        String strX = "abcdefg";
        int intX = strX.length();
        System.out.println("abcdefg".substring(2,intX-1));
    }
    public void getAttribute(Map<String,Object> map,
                             String str1,
                             String str2,
                             String str3,
                             String str4
                             ){

    }
    public void getAttribute(Map<String,Object> map,
                             String str1,
                             String str2,
                             String str3,
                             int int1){

    }
    public void getAttribute(Map<String,Object> map,
                             String str1,
                             String str2,
                             int int1,
                             int int2){

    }

    public static int iStatic;

    public BedaClass(int iStatic) {
        this.iStatic = iStatic;
    }

    public static int getiStatic(){
        return iStatic;
    }


}

