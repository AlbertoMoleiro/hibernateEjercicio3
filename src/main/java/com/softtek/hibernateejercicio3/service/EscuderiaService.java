package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;
import com.softtek.hibernateejercicio3.repository.IEscuderiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EscuderiaService implements IEscuderiaService{

    @Autowired
    private IEscuderiaRepo escuderiaRepo;

    @Override
    public Set<Piloto> getPilotosByEscuderia(Long escuderia) {
        return escuderiaRepo.findById(escuderia).get().getPilotos();
    }
}
