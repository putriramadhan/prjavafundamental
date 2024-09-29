package com.juaracoding.prjavafundamental.exception;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 17:45
@Last Modified 29/09/2024 17:45
Version 1.0
*/

import com.juaracoding.prjavafundamental.util.GlobalFunction;

import java.io.IOException;
import java.util.Scanner;

public class KeywordThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keyword: ");
        String strKeyword = sc.nextLine();
        System.out.println("INPUTAN STRING : "+strKeyword);
        if(strKeyword.contains("Saya")){
      //      System.out.println("Anda Memasukkan Kata-kata Terlarang...!");
            throw new IllegalArgumentException("Anda Memasukkan Kata-kata Terlarang...!. yaitu "+strKeyword);
        }
//        double douX = 1.06 + 3.35;
//        System.out.println("DOUX NUMBER :"+douX);
    }

    public static void getData()throws ArithmeticException {
        //logic IO Handling

    }
    public static void catchData(){
        try {
            getData();
        } catch (ArithmeticException e) {
            System.out.println(e);
            //file
            //log table
            //SMTP
        }
    }
}

