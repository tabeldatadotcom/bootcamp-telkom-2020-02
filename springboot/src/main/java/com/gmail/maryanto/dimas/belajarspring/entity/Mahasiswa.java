package com.gmail.maryanto.dimas.belajarspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mahasiswa {

    private String nim;
    private String nama;
    private Kelas kelas;

}
