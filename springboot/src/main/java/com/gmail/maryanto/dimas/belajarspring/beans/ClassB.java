package com.gmail.maryanto.dimas.belajarspring.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class ClassB {

    @Autowired
    private ClassC classC;
}
