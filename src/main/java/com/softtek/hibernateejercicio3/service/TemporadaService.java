package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;
import com.softtek.hibernateejercicio3.repository.ITemporadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TemporadaService implements ITemporadaService{
    @Autowired
    private ITemporadaRepo temporadaRepo;

    @Override
    public Set<Piloto> findByTemporada(Long temporada) {
        return temporadaRepo.findById(temporada).get().getPilotos();
    }
}
