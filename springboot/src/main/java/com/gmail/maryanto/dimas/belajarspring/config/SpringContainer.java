package com.gmail.maryanto.dimas.belajarspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gmail.maryanto.dimas.belajarspring.beans")
public class SpringContainer {

    @Bean
    public String getNama() {
        return "Dimas Maryanto";
    }

    @Bean
    public String getNama1() {
        return "Muhamad Yusuf";
    }

}
