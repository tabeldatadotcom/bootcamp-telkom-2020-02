package com.gmail.maryanto.dimas.belajarspring;


import com.gmail.maryanto.dimas.belajarspring.beans.ClassA;
import com.gmail.maryanto.dimas.belajarspring.beans.ClassB;
import com.gmail.maryanto.dimas.belajarspring.beans.ClassC;
import com.gmail.maryanto.dimas.belajarspring.config.SpringContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BelajarSpringApplication {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(SpringContainer.class);
        ClassA classA = container.getBean( "classA", ClassA.class);

        System.out.println("Nama saya dari class a " + classA.getClassB().getClassC().getNama());

    }

}
