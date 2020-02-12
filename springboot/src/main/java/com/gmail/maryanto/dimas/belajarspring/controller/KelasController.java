package com.gmail.maryanto.dimas.belajarspring.controller;

import com.gmail.maryanto.dimas.belajarspring.entity.Kelas;
import com.gmail.maryanto.dimas.belajarspring.service.KelasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/kelas")
public class KelasController {

    @Autowired
    private KelasService service;

    @GetMapping("/new")
    public String formNew(Model model, @ModelAttribute Kelas kelas) {
        model.addAttribute("kelas", kelas);
        return "kelas/add-kelas";
    }

    @PostMapping("/save")
    public String submitNewValue(Model model, @ModelAttribute @Valid Kelas kelas, BindingResult binding) {
        if (binding.hasErrors()) {
            model.addAttribute("kelas", kelas);
            return "/kelas/new";
        }
        log.info("{}", kelas);
        service.save(kelas);
        return "redirect:/kelas/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("listKelas", service.findAll());
        return "kelas/list-kelas";
    }

    @GetMapping("/delete")
    public String hapusById(@RequestParam("kelasId") String id) {
        service.remove(id);
        return "redirect:/kelas/list";
    }
}
