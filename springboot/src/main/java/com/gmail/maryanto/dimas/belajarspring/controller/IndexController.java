package com.gmail.maryanto.dimas.belajarspring.controller;

import com.gmail.maryanto.dimas.belajarspring.entity.Kelas;
import com.gmail.maryanto.dimas.belajarspring.entity.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mahasiswa")
public class IndexController {

    @GetMapping("/list")
    public String listMahasiswa(ModelMap data) {
        data.addAttribute("tanggal", LocalDateTime.now());
        Kelas kelasIF = new Kelas();
        kelasIF.setId("IF");
        kelasIF.setNama("Informatika");
        kelasIF.setAngkatan(2015);

        data.addAttribute("kelas", kelasIF);

        List<Mahasiswa> listMahasiswa = Arrays.asList(
                new Mahasiswa("10511148", "Dimas Maryanto", kelasIF),
                new Mahasiswa("10512345", "Muhamad Yusuf", kelasIF),
                new Mahasiswa("011234234", "Abdul", kelasIF)
        );
        data.addAttribute("listMahasiswa", listMahasiswa);
        return "index";
    }
}
