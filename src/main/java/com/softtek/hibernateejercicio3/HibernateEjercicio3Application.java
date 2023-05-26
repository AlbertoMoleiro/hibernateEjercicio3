package com.softtek.hibernateejercicio3;

import com.softtek.hibernateejercicio3.service.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateEjercicio3Application implements CommandLineRunner {

    @Autowired
    private PilotoService pilotoService;
    public static void main(String[] args) {
        SpringApplication.run(HibernateEjercicio3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pilotoService.findByTemporada(1L).forEach(p -> System.out.println(p.getNombre()));
        pilotoService.findByEscuderia(1L).forEach(p -> System.out.println(p.getNombre()));

        pilotoService.findBySueldo(100).forEach(p -> System.out.println(p.getNombre()));

        pilotoService.findByPublicidad(100, 30000).forEach(p -> System.out.println(p.getNombre()));

//        pilotoService.findNotInItaly().forEach(p -> System.out.println(p.getNombre()));

    }
}
