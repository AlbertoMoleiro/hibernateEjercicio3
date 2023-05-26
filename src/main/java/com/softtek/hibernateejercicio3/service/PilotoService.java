package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;
import com.softtek.hibernateejercicio3.repository.IPilotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoService implements IPilotoService {

    @Autowired
    private IPilotoRepo pilotoRepo;

    @Override
    public List<Piloto> findByTemporada(Long idTemporada) {
        return pilotoRepo.findByTemporada(idTemporada);
    }

    @Override
    public List<Piloto> findByEscuderia(Long idEscuderia) {
        return pilotoRepo.findByEscuderia(idEscuderia);
    }

    @Override
    public List<Piloto> findBySueldo(Integer sueldo) {
        return pilotoRepo.findBySueldo(sueldo);
    }

    @Override
    public List<Piloto> findByPublicidad(Integer publicidad1, Integer publicidad2) {
        return pilotoRepo.findByPublicidad(publicidad1, publicidad2);
    }

    @Override
    public List<Piloto> findNotInItaly() {
        return pilotoRepo.findNotInItaly();
    }
}