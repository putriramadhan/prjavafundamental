package com.juaracoding.prjavafundamental.exception;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 22/09/2024 13:17
@Last Modified 22/09/2024 13:17
Version 1.0
*/

import java.sql.SQLOutput;

public class ClassifiedException {
    public static void main(String[] args) {
        System.out.println("INI yang dieksekusi");

        try{
            //jalankan proses
            int intX = 1/0;
            int intY = intX;
            // error

            System.out.println(intX/intY);

            // close / kill proses open connectivity
        }catch(Exception e){
            System.out.println("Ketangkep nih error "+e.getMessage());
        }finally{
            System.out.println("Masuk ke Finally ...");
            //close connectivity nya disini...
        }
        System.out.println("Berhenti Disini ...");



        //SQL -> connectivity ke database
        //IO -> File
    }
}

