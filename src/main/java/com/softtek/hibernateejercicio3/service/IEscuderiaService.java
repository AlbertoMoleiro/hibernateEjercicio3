package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;

import java.util.Set;

public interface IEscuderiaService {

    Set<Piloto> getPilotosByEscuderia(Long escuderia);
}
