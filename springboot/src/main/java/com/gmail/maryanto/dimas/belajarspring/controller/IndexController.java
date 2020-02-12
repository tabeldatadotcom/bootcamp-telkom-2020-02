package com.gmail.maryanto.dimas.belajarspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mahasiswa")
public class IndexController {

    @GetMapping("/list")
    public String listMahasiswa() {
        return "index";
    }
}
