package com.juaracoding.prjavafundamental.programmingbasics;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 06/09/2024 06:29
@Last Modified 06/09/2024 06:29
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;

public class PassingBy {
    public  static  void main (String[] args){
        int intX = 0;
        intX = getDataX();

        System.out.println(intX);
        List<Integer> listX = getDataList();
        int intList = listX.size();
        for (int i = 0; i < getDataList().size(); i++){

        }
    }

    public static Integer getDataX(){
        return ((10*8)-2) + 6;
    }

    public static List getDataList(){
        String strX = "Hello World";

        List list = new ArrayList();
        list.add(strX);
        list.add(strX + "abc");
        list.add(strX + "2323");

        return  list;
    }
}