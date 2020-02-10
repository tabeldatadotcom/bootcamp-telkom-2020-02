package com.gmail.maryanto.dimas;

import com.gmail.maryanto.dimas.inheritance.Motor;
import com.gmail.maryanto.dimas.inheritance.Sepeda;

public class TipeData {


    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda();
        System.out.println("jumlah roda : " + sepeda.data());

        sepeda = new Motor();
        System.out.println("jumlah roda : " + sepeda.data());
        Motor honda = new Motor();
        System.out.println("jumlah roda : "+ honda.getJumlahRoda());

        System.out.println("jumlah roda : "+ honda.getJumlahRoda(3));

        System.out.println("jumlah roda : "+ honda.getJumlahRoda(3, true));
    }

}
