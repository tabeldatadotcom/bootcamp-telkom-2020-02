package com.gmail.maryanto.dimas;


import java.time.LocalDate;


public class TipeData {

    public static Integer hitungPajak(){
        return 10 * 10;
    }

    public static void main(String[] args) {
        String namaLengkap = nama();
        System.out.println("Nama lengkap saya adalah "+ namaLengkap);

        Integer pajak = hitungPajak();
        System.out.println("nilai pajak "+ pajak);
    }

    public static String nama(){
        return "Dimas Maryanto";
    }
}
