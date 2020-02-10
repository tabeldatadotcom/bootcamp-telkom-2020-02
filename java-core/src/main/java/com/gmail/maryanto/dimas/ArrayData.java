package com.gmail.maryanto.dimas;

import java.util.*;

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

        Set<String> sets = new HashSet<>(Arrays.asList(
                "Dimas", "Dimas", "Yusuf", "Yusuf", "Abdul", "Rega"
        ));

        for (String s : sets) {
            System.out.println("nama: " + s);
        }
        
        Map<String, String> maps = new HashMap<>();
        maps.put("test", "Dimas");
        maps.put("test1", "Dimas Maryanto");
        maps.put("test", "Dimas");
        maps.put("test", "Dimas");

        maps.forEach((key, value) -> {
            System.out.println(
                    "nilai key " + key +
                            " sedangkan valuenya " + value
            );
        });
    }
}
