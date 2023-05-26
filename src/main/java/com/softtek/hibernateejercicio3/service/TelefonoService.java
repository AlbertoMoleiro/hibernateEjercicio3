package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Telefono;
import com.softtek.hibernateejercicio3.repository.ITelefonoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoService implements ITelefonoService{

    @Autowired
    private ITelefonoRepo telefonoRepo;
    @Override
    public List<Telefono> getByPilotoName(String nombre) {
        return telefonoRepo.getByPilotoName(nombre);
    }
}
