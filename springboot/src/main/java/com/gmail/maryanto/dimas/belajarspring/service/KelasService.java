package com.gmail.maryanto.dimas.belajarspring.service;

import com.gmail.maryanto.dimas.belajarspring.entity.Kelas;
import com.gmail.maryanto.dimas.belajarspring.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class KelasService {

    @Autowired
    private KelasRepository repo;

    public Optional<Kelas> findById(String id){
        return repo.findById(id);
    }

    public Iterable<Kelas> findAll() {
        return repo.findAll();
    }

    @Transactional
    public Kelas save(Kelas kelas) {
        return repo.save(kelas);
    }

    @Transactional
    public void remove(String id) {
        repo.deleteById(id);
    }
}
