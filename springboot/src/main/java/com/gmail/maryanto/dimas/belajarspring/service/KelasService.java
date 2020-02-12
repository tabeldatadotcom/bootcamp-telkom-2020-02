package com.gmail.maryanto.dimas.belajarspring.service;

import com.gmail.maryanto.dimas.belajarspring.entity.Kelas;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class KelasService {

    public List<Kelas> findAll() {
        return Arrays.asList(
                new Kelas(UUID.randomUUID().toString(), "IF", 2017),
                new Kelas(UUID.randomUUID().toString(), "IF", 2018),
                new Kelas(UUID.randomUUID().toString(), "SI", 2017)
        );
    }
}
