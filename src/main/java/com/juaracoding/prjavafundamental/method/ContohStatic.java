package com.juaracoding.prjavafundamental.method;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 21:19
@Last Modified 29/09/2024 21:19
Version 1.0
*/

public class ContohStatic {
    public static void main(String[] args) {

        BedaClass bedaClass = new BedaClass( 20);
        System.out.println(bedaClass.toString());
        bedaClass = new BedaClass(13);
        System.out.println(bedaClass.toString());
    }
}

