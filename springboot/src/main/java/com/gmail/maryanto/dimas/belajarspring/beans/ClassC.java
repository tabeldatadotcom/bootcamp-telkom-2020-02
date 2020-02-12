package com.gmail.maryanto.dimas.belajarspring.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class ClassC {

    @Autowired
    @Qualifier("getNama1")
    private String nama;
}
