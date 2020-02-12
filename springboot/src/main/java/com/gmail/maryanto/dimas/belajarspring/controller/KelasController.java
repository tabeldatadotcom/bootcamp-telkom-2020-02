package com.gmail.maryanto.dimas.belajarspring.controller;

import com.gmail.maryanto.dimas.belajarspring.entity.Kelas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/kelas")
public class KelasController {

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
        return "redirect:/kelas/new";
    }
}
