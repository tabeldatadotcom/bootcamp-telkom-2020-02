package com.gmail.maryanto.dimas;


import java.time.LocalDate;

public class TipeData {

    public static void main(String[] args) {
        Integer umur = 20;
        System.out.println("Umur saya adalah " + umur);

        umur = 20 + 10;
        System.out.println("20 + 10 " + umur);

        umur++;
        System.out.println("umur++ " + umur);

        umur = 20 - 10;
        System.out.println("20 - 10 " + umur);

        umur = 20 * 10;
        System.out.println("20 * 10 " + umur);

        umur = 20 / 10;
        System.out.println("0 / 10 " + umur);

        umur = 20 % 10;
        System.out.println("20 % 10 " + umur);


        Boolean isValid = true;
        System.out.println(
                "Nilai dari variable isValid adalah " +
                        (isValid ? "Benar" : "Salah")
        );

        Character aChar = 'a';
        System.out.println(aChar);

        LocalDate now = LocalDate.now().plusDays(2).plusMonths(2);
        System.out.println("Tanggal sekarang: " + now);


        Integer intVal = 10;
        Float floatVal = 0f;
        Double doubleVal = (double) intVal * floatVal;
        System.out.println("Nilai " + intVal + " * " + floatVal + " = " + doubleVal);

        Integer bil1 = 11;
        if (bil1 == 11) {
            System.out.println("Bilangan Sama");
        } else if (true) {
            System.out.println("true");
        } else {
            System.out.println("Bilangan tidak sama");
        }

    }
}
