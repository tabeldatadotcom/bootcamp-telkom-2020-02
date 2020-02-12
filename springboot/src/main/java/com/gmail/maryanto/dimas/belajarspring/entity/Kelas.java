package com.gmail.maryanto.dimas.belajarspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_kelas")
public class Kelas {

    @Id
    @GenericGenerator(name = "uuid2_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2_gen")
    @Column(name = "kelas_id", length = 64)
    private String id;
    @Column(name = "kelas_nama", length = 50)
    private String nama;
    @Column(name = "kelas_angkatan")
    private Integer angkatan;
}
