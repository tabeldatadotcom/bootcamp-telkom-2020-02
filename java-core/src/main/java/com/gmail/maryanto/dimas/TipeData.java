package com.gmail.maryanto.dimas;

public class TipeData {

    public static Integer hitungPajak(
            Integer bil1,
            Integer bil2) {
        return bil1 * bil2;
    }

    public static void main(String[] args) {
        Motor honda = new Motor();
        System.out.println("jumlah roda : " + honda.roda());
        System.out.println("jumlah manufacture : " + honda.manufacture());

        System.out.println("jumlah merek : " + honda.merek());
    }

    public static String nama(String[] args) {
        for (String data : args) {
            System.out.println(data);
        }
        return "Dimas Maryanto";
    }
}
