package com.gmail.maryanto.dimas.belajarspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kelas {

    private String id;
    private String nama;
    private Integer angkatan;
}
