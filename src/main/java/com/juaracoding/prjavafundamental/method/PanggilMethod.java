package com.juaracoding.prjavafundamental.method;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 29/09/2024 21:03
@Last Modified 29/09/2024 21:03
Version 1.0
*/

import com.juaracoding.prjavafundamental.exception.SampleMethod;

public class PanggilMethod extends SampleMethod {

    public static void main(String[] args) {
//        SampleMethod sampleMethod = new SampleMethod();
    }

    public void init(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public void init(String strNull){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }

    public void methodBiasa(){
        init(null);
    }

    public void methodLuarBiasa(){
        init();
    }

    public void methodBiasaLuar(){
        init();
    }


}
