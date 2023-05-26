package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;

import java.util.List;
import java.util.Set;

public interface ITemporadaService {
     Set<Piloto> findByTemporada(Long temporada);
}
