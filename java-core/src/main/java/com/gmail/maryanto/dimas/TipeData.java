package com.gmail.maryanto.dimas;

public class TipeData {

    public static Integer hitungPajak(
            Integer bil1,
            Integer bil2) {
        return bil1 * bil2;
    }

    public static void main(String[] args) {
        String namaLengkap = nama(args);
        System.out.println("Nama lengkap saya adalah " + namaLengkap);

        Integer pajak = hitungPajak(10, 100);
        System.out.println("nilai pajak " + pajak);
    }

    public static String nama(String[] args) {
        for (String data : args) {
            System.out.println(data);
        }
        return "Dimas Maryanto";
    }
}
