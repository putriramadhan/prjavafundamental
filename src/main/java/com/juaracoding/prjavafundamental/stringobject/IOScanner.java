package com.juaracoding.prjavafundamental.stringobject;
/*
Created By IntelliJ IDEA 2023.3.8 (Ultimate Edition)
Build #IU-233.15619.7, built on September 4, 2024
@Author PT.DIKA a.k.a. Putri Ramadhan
Java Developer
Created on 18/09/2024 12:59
@Last Modified 18/09/2024 12:59
Version 1.0
*/

import java.util.Scanner;

public class IOScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Text : ");
        String strNama = scanner.nextLine();
        System.out.println("Teks yang anda masukkan adalah " + strNama);

        System.out.println("Masukkan Nilai Bilangan Bulat");
        int intNilai = scanner.nextInt();
        System.out.println("Nilai Bilangan Bulat adalah : " + intNilai);

        System.out.print("Masukkan Nilai Bilangan Desimal : ");
        double douNilai = scanner.nextDouble();
        System.out.println("Nilai Bilangan Desimal adalah : " + douNilai);
        // proses aritmatika




    }
}

