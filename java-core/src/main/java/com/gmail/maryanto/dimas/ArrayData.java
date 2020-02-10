package com.gmail.maryanto.dimas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayData {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList(
                        "Dimas", "Yusuf", "Abdul", "Rega"
                )
        );

        list.add("Test");
        String nama = list.get(0);
        System.out.println("nama dari index ke 0: " + nama);

        for (String s : list) {
            System.out.println("nama: " + s);
        }

    }
}
