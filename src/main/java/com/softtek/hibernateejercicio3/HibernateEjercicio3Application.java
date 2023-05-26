package com.softtek.hibernateejercicio3;

import com.softtek.hibernateejercicio3.service.EscuderiaService;
import com.softtek.hibernateejercicio3.service.PilotoService;
import com.softtek.hibernateejercicio3.service.TelefonoService;
import com.softtek.hibernateejercicio3.service.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateEjercicio3Application implements CommandLineRunner {

    @Autowired
    private TemporadaService temporadaService;
    @Autowired
    private PilotoService pilotoService;
    @Autowired
    private TelefonoService telefonoService;
    @Autowired
    private EscuderiaService escuderiaService;
    public static void main(String[] args) {
        SpringApplication.run(HibernateEjercicio3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------- Pilotos Temporada -----------");
        temporadaService.findByTemporada(1L).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("----------- Pilotos Escuderia -----------");
//        pilotoService.findByEscuderia(1L).forEach(p -> System.out.println(p.getNombre()));
        escuderiaService.getPilotosByEscuderia(1L).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("----------- Pilotos Sueldo -----------");
        pilotoService.findBySueldo(100).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("----------- Pilotos Publicidad -----------");
        pilotoService.findByPublicidad(100, 30000).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("----------- Pilotos No Italia -----------");
       pilotoService.findNotInItaly().forEach(p -> System.out.println(p.getNombre()));

        System.out.println("----------- Pilotos Telefono -----------");
        telefonoService.getByPilotoName("Fernando Alonso").forEach(t -> System.out.println(t.getNumero()));
    }
}
